package serviceauth;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;
import security.PasswordHasher;

public class StudentLogin implements LoginStrategy {
    private final StudentDao dao = new StudentDaoImpl();

    @Override
    public int login(String username, String password) {
        return dao.findByUsername(username)
                .filter(s -> PasswordHasher.verify(password, s.getPasswordHash()))
                .filter(Student::isVerified)
                .map(Student::getUsersId)
                .orElse(-1);
    }
}
