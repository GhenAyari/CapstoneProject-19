package dao;

import 
import java.util.List;
import java.util.Optional;

public interface StudentDao {
    void insert(Student s);
    Optional<Student> findByUsername(String username);
    List<Student> findUnverified();
    void setVerified(int id, boolean verified);
}