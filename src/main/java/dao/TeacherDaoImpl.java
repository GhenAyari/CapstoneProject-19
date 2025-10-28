package dao;
import config.ConnectionManager;
import model.Teacher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    public class TeacherDaoImpl implements TeacherDao {

        @Override
        public void insert(Teacher t) {
            String sql = "INSERT INTO teacher(username, password, is_verified) VALUES(?,?,?)";
            try (Connection c = ConnectionManager.getConnection();
                 PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, t.getUsername());
                ps.setString(2, t.getPasswordHash());
                ps.setBoolean(3, t.isVerified());
                ps.executeUpdate();
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) t.setUsersId(rs.getInt(1));
                }
            } catch (SQLException e) { throw new RuntimeException(e); }
        }

        @Override
        public Optional<Teacher> findByUsername(String username) {
            String sql = "SELECT users_id, username, password, is_verified FROM teacher WHERE username=?";
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
        public List<Teacher> findUnverified() {
            String sql = "SELECT users_id, username, password, is_verified FROM teacher WHERE is_verified=0";
            List<Teacher> list = new ArrayList<>();
            try (Connection c = ConnectionManager.getConnection();
                 PreparedStatement ps = c.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            } catch (SQLException e) { throw new RuntimeException(e); }
            return list;
        }

        @Override
        public void setVerified(int id, boolean verified) {
            String sql = "UPDATE teacher SET is_verified=? WHERE users_id=?";
            try (Connection c = ConnectionManager.getConnection();
                 PreparedStatement ps = c.prepareStatement(sql)) {
                ps.setBoolean(1, verified);
                ps.setInt(2, id);
                ps.executeUpdate();
            } catch (SQLException e) { throw new RuntimeException(e); }
        }

        private Teacher map(ResultSet rs) throws SQLException {
            Teacher t = new Teacher();
            t.setUsersId(rs.getInt("users_id"));
            t.setUsername(rs.getString("username"));
            t.setPasswordHash(rs.getString("password"));
            t.setVerified(rs.getBoolean("is_verified"));
            return t;
        }
        @Override public java.util.Optional<Teacher> findById(Integer id) { return findById(id.intValue()); }
        public java.util.Optional<Teacher> findById(int id) {
            String sql = "SELECT users_id,username,password,is_verified FROM teacher WHERE users_id=?";
            try (var c = config.ConnectionManager.getConnection();
                 var ps = c.prepareStatement(sql)) {
                ps.setInt(1, id);
                try (var rs = ps.executeQuery()) {
                    if (rs.next()) {
                        var t = new model.Teacher();
                        t.setUsersId(rs.getInt("users_id"));
                        t.setUsername(rs.getString("username"));
                        t.setPasswordHash(rs.getString("password"));
                        t.setVerified(rs.getBoolean("is_verified"));
                        return java.util.Optional.of(t);
                    }
                }
            } catch (Exception e) { throw new RuntimeException(e); }
            return java.util.Optional.empty();
        }

        @Override public void update(model.Teacher t) {
            String sql="UPDATE teacher SET username=?, password=?, is_verified=? WHERE users_id=?";
            try (var c = config.ConnectionManager.getConnection();
                 var ps = c.prepareStatement(sql)) {
                ps.setString(1, t.getUsername());
                ps.setString(2, t.getPasswordHash());
                ps.setBoolean(3, t.isVerified());
                ps.setInt(4, t.getUsersId());
                ps.executeUpdate();
            } catch (Exception e) { throw new RuntimeException(e); }
        }

        @Override public void deleteById(Integer id) {
            try (var c = config.ConnectionManager.getConnection();
                 var ps = c.prepareStatement("DELETE FROM teacher WHERE users_id=?")) {
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (Exception e) { throw new RuntimeException(e); }
        }

        @Override public java.util.List<model.Teacher> findAll() {
            var list = new java.util.ArrayList<model.Teacher>();
            String sql = "SELECT users_id,username,password,is_verified FROM teacher ORDER BY users_id";
            try (var c = config.ConnectionManager.getConnection();
                 var ps = c.prepareStatement(sql);
                 var rs = ps.executeQuery()) {
                while (rs.next()) {
                    var t = new model.Teacher();
                    t.setUsersId(rs.getInt("users_id"));
                    t.setUsername(rs.getString("username"));
                    t.setPasswordHash(rs.getString("password"));
                    t.setVerified(rs.getBoolean("is_verified"));
                    list.add(t);
                }
            } catch (Exception e) { throw new RuntimeException(e); }
            return list;
        }

    }

