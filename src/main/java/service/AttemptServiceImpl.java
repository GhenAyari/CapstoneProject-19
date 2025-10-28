package service;


import dao.QuizDao;
import dao.QuizDaoImpl;
import dao.RaporDao;
import dao.RaporDaoImpl;
import model.Quiz;
import model.Rapor;
import java.util.List;
import java.util.Map;

public class AttemptServiceImpl implements AttemptService {
    private final QuizDao quizDao = new QuizDaoImpl();
    private final RaporDao raporDao = new RaporDaoImpl();

    @Override
    public int submitAnswers(int studentId, String quizTitle, Map<Integer, Character> answers) {
        List<Quiz> qs = quizDao.findByTitleOrderByNumber(quizTitle);
        int correct = 0;
        for (Quiz q : qs) {
            char ans = Character.toUpperCase(answers.getOrDefault(q.getQuestionNumber(), ' '));
            if (ans == q.getCorrectAnswer()) correct++;
        }
        int total = qs.size();
        int score = total == 0 ? 0 : (int)Math.round(correct * 100.0 / total);

        Rapor r = new Rapor();
        r.setStudentId(studentId);
        r.setQuizTitle(quizTitle);
        r.setIsCorrect(correct);
        r.setIsIncorrect(total - correct);
        r.setTotalScores(score);
        raporDao.insert(r);
        return score;
    }

    public List<Rapor> listRaporByStudent(int studentId) {
        return new RaporDaoImpl().findByStudent(studentId);
    }
}
