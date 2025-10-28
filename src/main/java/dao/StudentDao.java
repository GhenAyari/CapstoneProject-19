package dao;

import model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentDao extends GenericDao<Student, Integer> {
    Optional<Student> findByUsername(String username);
    List<Student> findAll();
    List<Student> findUnverified();
    void setVerified(int id, boolean verified);
}
