package service;

public interface AuthService {
    void registerTeacher(String username, String rawPassword);
    void registerStudent(String username, String rawPassword);

    // Polymorphic login (role-aware)
    int login(String role, String username, String password);

    // Tetap sediakan helper lama (compatibility)
    int loginTeacher(String username, String password);
    int loginStudent(String username, String password);
}
