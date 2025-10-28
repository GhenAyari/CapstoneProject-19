package service;
import model.Quiz;
import java.util.List;

public interface QuizService {
    void createQuestion(Quiz q);
    void updateQuestion(Quiz q);
    void deleteQuestion(int questionId);
    void deleteQuizByTitle(String title, int teacherId);
    List<String> listTitles();
    List<Quiz> loadByTitle(String title);
}
