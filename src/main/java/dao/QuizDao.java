package dao;

import model.Quiz;
import java.util.List;

public interface QuizDao {
    void insertQuestion(Quiz q);
    void updateQuestion(Quiz q);
    void deleteQuestion(int questionId);
    void deleteByTitleAndTeacher(String title, int teacherId);
    List<String> listDistinctTitles();                 // semua judul quiz
    List<Quiz> findByTitleOrderByNumber(String title); // semua pertanyaan suatu quiz
}