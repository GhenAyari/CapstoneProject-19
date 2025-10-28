package serviceauth;

import dao.TeacherDao;
import dao.TeacherDaoImpl;
import model.Teacher;
import security.PasswordHasher;

public class TeacherLogin implements LoginStrategy {
    private final TeacherDao dao = new TeacherDaoImpl();

    @Override
    public int login(String username, String password) {
        return dao.findByUsername(username)
                .filter(t -> PasswordHasher.verify(password, t.getPasswordHash()))
                .filter(Teacher::isVerified)
                .map(Teacher::getUsersId)
                .orElse(-1);
    }
}
