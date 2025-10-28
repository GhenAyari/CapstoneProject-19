package model;

import java.sql.Timestamp;

public class Rapor {
    private Integer idRapor;
    private Integer studentId;
    private String quizTitle;
    private int isIncorrect;
    private int isCorrect;
    private int totalScores;
    private Timestamp attemptDate;

    public Integer getIdRapor() { return idRapor; }
    public void setIdRapor(Integer idRapor) { this.idRapor = idRapor; }
    public Integer getStudentId() { return studentId; }
    public void setStudentId(Integer studentId) { this.studentId = studentId; }
    public String getQuizTitle() { return quizTitle; }
    public void setQuizTitle(String quizTitle) { this.quizTitle = quizTitle; }
    public int getIsIncorrect() { return isIncorrect; }
    public void setIsIncorrect(int isIncorrect) { this.isIncorrect = isIncorrect; }
    public int getIsCorrect() { return isCorrect; }
    public void setIsCorrect(int isCorrect) { this.isCorrect = isCorrect; }
    public int getTotalScores() { return totalScores; }
    public void setTotalScores(int totalScores) { this.totalScores = totalScores; }
    public Timestamp getAttemptDate() { return attemptDate; }
    public void setAttemptDate(Timestamp attemptDate) { this.attemptDate = attemptDate; }
}
