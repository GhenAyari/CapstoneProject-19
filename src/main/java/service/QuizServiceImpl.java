package service;

import dao.QuizDao;
import dao.QuizDaoImpl;
import model.Quiz;
import java.util.List;

public class QuizServiceImpl implements QuizService {
    private final QuizDao quizDao = new QuizDaoImpl();

    public void createQuestion(Quiz q) { quizDao.insertQuestion(q); }
    public void updateQuestion(Quiz q) { quizDao.updateQuestion(q); }
    public void deleteQuestion(int id) { quizDao.deleteQuestion(id); }
    public void deleteQuizByTitle(String t, int teacherId){ quizDao.deleteByTitleAndTeacher(t, teacherId); }
    public List<String> listTitles(){ return quizDao.listDistinctTitles(); }
    public List<Quiz> loadByTitle(String t){ return quizDao.findByTitleOrderByNumber(t); }
}
