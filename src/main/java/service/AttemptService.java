package service;

import model.Rapor;
import java.util.List;
import java.util.Map;

public interface AttemptService {
    int submitAnswers(int studentId, String quizTitle, Map<Integer, Character> answers);
    List<Rapor> listRaporByStudent(int studentId); // ⬅ tambahkan ini
}
