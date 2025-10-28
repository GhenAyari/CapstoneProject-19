package service;

import dao.*;
//import dao.TeacherDaoImpl;
import model.Teacher;
import model.Student;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private final TeacherDao teacherDao = new TeacherDaoImpl();
    private final StudentDao studentDao = new StudentDaoImpl();

    public List<Teacher> listUnverifiedTeachers() { return teacherDao.findUnverified(); }
    public List<Student> listUnverifiedStudents() { return studentDao.findUnverified(); }
    public void verifyTeacher(int teacherId) { teacherDao.setVerified(teacherId, true); }
    public void verifyStudent(int studentId) { studentDao.setVerified(studentId, true); }
}