package service;

import java.util.Map;

public interface AttemptService {
    // answers: key = question_number, value = 'A'/'B'/'C'/'D'
    int submitAnswers(int studentId, String quizTitle, Map<Integer, Character> answers);
}
