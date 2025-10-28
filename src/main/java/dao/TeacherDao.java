package dao;

import model.Teacher;
import java.util.List;
import java.util.Optional;

public interface TeacherDao extends GenericDao<Teacher, Integer> {
    Optional<Teacher> findByUsername(String username);
    List<Teacher> findAll();
    List<Teacher> findUnverified();
    void setVerified(int id, boolean verified);
}
