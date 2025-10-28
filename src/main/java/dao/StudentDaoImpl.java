package dao;

import config.ConnectionManager;
import model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {

    // ====== CREATE ======
    @Override
    public void insert(Student s) {
        String sql = "INSERT INTO student(username, password, is_verified) VALUES(?,?,?)";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, s.getUsername());
            ps.setString(2, s.getPasswordHash());
            ps.setBoolean(3, s.isVerified());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) s.setUsersId(rs.getInt(1));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    // ====== READ ======
    @Override
    public Optional<Student> findById(Integer id) {
        String sql = "SELECT users_id, username, password, is_verified FROM student WHERE users_id=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return Optional.of(map(rs));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
        return Optional.empty();
    }

    @Override
    public Optional<Student> findByUsername(String username) {
        String sql = "SELECT users_id, username, password, is_verified FROM student WHERE username=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) return Optional.of(map(rs));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        String sql = "SELECT users_id, username, password, is_verified FROM student ORDER BY users_id";
        List<Student> list = new ArrayList<>();
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) { throw new RuntimeException(e); }
        return list;
    }

    @Override
    public List<Student> findUnverified() {
        String sql = "SELECT users_id, username, password, is_verified FROM student WHERE is_verified=0";
        List<Student> list = new ArrayList<>();
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) list.add(map(rs));
        } catch (SQLException e) { throw new RuntimeException(e); }
        return list;
    }

    // ====== UPDATE ======
    @Override
    public void update(Student s) {
        String sql = "UPDATE student SET username=?, password=?, is_verified=? WHERE users_id=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, s.getUsername());
            ps.setString(2, s.getPasswordHash());
            ps.setBoolean(3, s.isVerified());
            ps.setInt(4, s.getUsersId());
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public void setVerified(int id, boolean verified) {
        String sql = "UPDATE student SET is_verified=? WHERE users_id=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setBoolean(1, verified);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    // ====== DELETE ======
    @Override
    public void deleteById(Integer id) {
        String sql = "DELETE FROM student WHERE users_id=?";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    // ====== Mapper ======
    private Student map(ResultSet rs) throws SQLException {
        Student s = new Student();
        s.setUsersId(rs.getInt("users_id"));
        s.setUsername(rs.getString("username"));
        s.setPasswordHash(rs.getString("password"));
        s.setVerified(rs.getBoolean("is_verified"));
        return s;
    }
}
