package service;

import model.Teacher;
import model.Student;
import java.util.List;

public interface AdminService {
    List<Teacher> listUnverifiedTeachers();
    List<Student> listUnverifiedStudents();
    void verifyTeacher(int teacherId);
    void verifyStudent(int studentId);
}