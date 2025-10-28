package dao;

import config.ConnectionManager;
import model.Rapor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RaporDaoImpl implements RaporDao {
    @Override
    public void insert(Rapor r) {
        String sql = "INSERT INTO rapor(student_id, quiz_title, is_incorrect, is_correct, total_scores, attempt_date) " +
                "VALUES(?,?,?,?,?,CURRENT_TIMESTAMP)";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, r.getStudentId());
            ps.setString(2, r.getQuizTitle());
            ps.setInt(3, r.getIsIncorrect());
            ps.setInt(4, r.getIsCorrect());
            ps.setInt(5, r.getTotalScores());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) r.setIdRapor(rs.getInt(1));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public List<Rapor> findByStudent(int studentId) {
        String sql = "SELECT * FROM rapor WHERE student_id=? ORDER BY attempt_date DESC";
        List<Rapor> list = new ArrayList<>();
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Rapor r = new Rapor();
                    r.setIdRapor(rs.getInt("id_rapor"));
                    r.setStudentId(rs.getInt("student_id"));
                    r.setQuizTitle(rs.getString("quiz_title"));
                    r.setIsIncorrect(rs.getInt("is_incorrect"));
                    r.setIsCorrect(rs.getInt("is_correct"));
                    r.setTotalScores(rs.getInt("total_scores"));
                    r.setAttemptDate(rs.getTimestamp("attempt_date"));
                    list.add(r);
                }
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
        return list;
    }
}