package dao;

import config.ConnectionManager;
import model.Quiz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuizDaoImpl implements QuizDao {
    @Override
    public void insertQuestion(Quiz q) {
        String sql = """
            INSERT INTO quiz(teacher_id, quiz_title, description, question_text, soal,
                             option_a, option_b, option_c, option_d, correct_answer, question_number)
            VALUES(?,?,?,?,?,?,?,?,?,?,?)
        """;
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, q.getTeacherId());
            ps.setString(2, q.getQuizTitle());
            ps.setString(3, q.getDescription());
            ps.setString(4, q.getQuestionText());
            ps.setString(5, q.getSoal());
            ps.setString(6, q.getOptionA());
            ps.setString(7, q.getOptionB());
            ps.setString(8, q.getOptionC());
            ps.setString(9, q.getOptionD());
            ps.setString(10, String.valueOf(q.getCorrectAnswer()));
            ps.setInt(11, q.getQuestionNumber());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) q.setQuestionId(rs.getInt(1));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public void updateQuestion(Quiz q) {
        String sql = """
            UPDATE quiz SET description=?, question_text=?, soal=?,
                   option_a=?, option_b=?, option_c=?, option_d=?,
                   correct_answer=?, question_number=?
            WHERE question_id=?
        """;
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, q.getDescription());
            ps.setString(2, q.getQuestionText());
            ps.setString(3, q.getSoal());
            ps.setString(4, q.getOptionA());
            ps.setString(5, q.getOptionB());
            ps.setString(6, q.getOptionC());
            ps.setString(7, q.getOptionD());
            ps.setString(8, String.valueOf(q.getCorrectAnswer()));
            ps.setInt(9, q.getQuestionNumber());
            ps.setInt(10, q.getQuestionId());
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public void deleteQuestion(int questionId) {
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement("DELETE FROM quiz WHERE question_id=?")) {
            ps.setInt(1, questionId);
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public void deleteByTitleAndTeacher(String title, int teacherId) {
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement("DELETE FROM quiz WHERE quiz_title=? AND teacher_id=?")) {
            ps.setString(1, title);
            ps.setInt(2, teacherId);
            ps.executeUpdate();
        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    @Override
    public List<String> listDistinctTitles() {
        List<String> titles = new ArrayList<>();
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement("SELECT DISTINCT quiz_title FROM quiz ORDER BY quiz_title");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) titles.add(rs.getString(1));
        } catch (SQLException e) { throw new RuntimeException(e); }
        return titles;
    }

    @Override
    public List<Quiz> findByTitleOrderByNumber(String title) {
        List<Quiz> list = new ArrayList<>();
        String sql = "SELECT * FROM quiz WHERE quiz_title=? ORDER BY question_number ASC";
        try (Connection c = ConnectionManager.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, title);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) list.add(map(rs));
            }
        } catch (SQLException e) { throw new RuntimeException(e); }
        return list;
    }

    private Quiz map(ResultSet rs) throws SQLException {
        Quiz q = new Quiz();
        q.setQuestionId(rs.getInt("question_id"));
        q.setTeacherId(rs.getInt("teacher_id"));
        q.setQuizTitle(rs.getString("quiz_title"));
        q.setDescription(rs.getString("description"));
        q.setQuestionText(rs.getString("question_text"));
        q.setSoal(rs.getString("soal"));
        q.setOptionA(rs.getString("option_a"));
        q.setOptionB(rs.getString("option_b"));
        q.setOptionC(rs.getString("option_c"));
        q.setOptionD(rs.getString("option_d"));
        q.setCorrectAnswer(rs.getString("correct_answer").charAt(0));
        q.setQuestionNumber(rs.getInt("question_number"));
        return q;
    }
}
