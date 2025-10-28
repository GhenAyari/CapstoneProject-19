package service;

import dao.*;
import model.Student;
import model.Teacher;
import security.PasswordHasher;
import serviceauth.LoginStrategy;
import serviceauth.StudentLogin;
import serviceauth.TeacherLogin;

import java.util.HashMap;
import java.util.Map;

public class AuthServiceImpl implements AuthService {
    private final TeacherDao teacherDao = new TeacherDaoImpl();
    private final StudentDao studentDao = new StudentDaoImpl();

    private final Map<String, LoginStrategy> strategies = new HashMap<>();

    public AuthServiceImpl() {
        strategies.put("TEACHER", new TeacherLogin());
        strategies.put("STUDENT", new StudentLogin());
        // ADMIN bisa kamu tambahkan sendiri strateginya nanti
    }

    @Override
    public void registerTeacher(String username, String rawPassword) {
        teacherDao.findByUsername(username).ifPresent(t -> { throw new IllegalArgumentException("Username teacher sudah dipakai"); });
        Teacher t = new Teacher();
        t.setUsername(username);
        t.setPasswordHash(PasswordHasher.hash(rawPassword));
        t.setVerified(false);
        teacherDao.insert(t);
    }

    @Override
    public void registerStudent(String username, String rawPassword) {
        studentDao.findByUsername(username).ifPresent(s -> { throw new IllegalArgumentException("Username student sudah dipakai"); });
        Student s = new Student();
        s.setUsername(username);
        s.setPasswordHash(PasswordHasher.hash(rawPassword));
        s.setVerified(false);
        studentDao.insert(s);
    }

    @Override
    public int login(String role, String username, String password) {
        LoginStrategy st = strategies.get(role.toUpperCase());
        if (st == null) return -1;
        return st.login(username, password);
    }

    @Override public int loginTeacher(String u, String p) { return login("TEACHER", u, p); }
    @Override public int loginStudent(String u, String p) { return login("STUDENT", u, p); }
}