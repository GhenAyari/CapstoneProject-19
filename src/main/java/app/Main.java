package app;

import config.ConnectionManager;
import service.*;
import java.sql.Connection;


    public class Main {
        public static void main(String[] args) {
            AuthService auth = new AuthServiceImpl();
            AdminService admin = new AdminServiceImpl();

            String tUser = "guru1", tPass = "Password@123";
            String sUser = "siswa1", sPass = "Password@123";

            // Register jika belum ada
            try { auth.registerTeacher(tUser, tPass); System.out.println("Reg teacher: " + tUser); }
            catch (IllegalArgumentException ignore) { System.out.println("Teacher sudah ada."); }
            try { auth.registerStudent(sUser, sPass); System.out.println("Reg student: " + sUser); }
            catch (IllegalArgumentException ignore) { System.out.println("Student sudah ada."); }

            // Verifikasi yang pending
            admin.listUnverifiedTeachers().forEach(t -> admin.verifyTeacher(t.getUsersId()));
            admin.listUnverifiedStudents().forEach(s -> admin.verifyStudent(s.getUsersId()));

            // Login
            int tId = auth.loginTeacher(tUser, tPass);
            int sId = auth.loginStudent(sUser, sPass);
            System.out.println("Teacher ID: " + tId + " | Student ID: " + sId);

            service.QuizService quizSvc = new service.QuizServiceImpl();
           service.AttemptService attemptSvc = new service.AttemptServiceImpl();

// 1) Teacher buat quiz "Quiz A" (2 soal)
            model.Quiz q1 = new model.Quiz();
            q1.setTeacherId(1);                    // ganti ke teacherId hasil login
            q1.setQuizTitle("Quiz A");
            q1.setDescription("Contoh quiz A");
            q1.setQuestionText("Bacaan 1");
            q1.setSoal("Ibu kota Indonesia?");
            q1.setOptionA("Bandung"); q1.setOptionB("Surabaya"); q1.setOptionC("Jakarta"); q1.setOptionD("Medan");
            q1.setCorrectAnswer('C');
            q1.setQuestionNumber(1);
            quizSvc.createQuestion(q1);

            model.Quiz q2 = new model.Quiz();
            q2.setTeacherId(1);
            q2.setQuizTitle("Quiz A");
            q2.setDescription("Contoh quiz A");
            q2.setQuestionText("Bacaan 2");
            q2.setSoal("2 + 2 = ?");
            q2.setOptionA("3"); q2.setOptionB("4"); q2.setOptionC("5"); q2.setOptionD("6");
            q2.setCorrectAnswer('B');
            q2.setQuestionNumber(2);
            quizSvc.createQuestion(q2);

// 2) Student mengerjakan
            java.util.Map<Integer, Character> ans = new java.util.HashMap<>();
            ans.put(1, 'C');
            ans.put(2, 'B');
            int score = attemptSvc.submitAnswers(1, "Quiz A", ans); // ganti 1 ke studentId login
            System.out.println("Score siswa: " + score);

// 3) Lihat rapor
            attemptSvc.listRaporByStudent(1).forEach(r ->
                    System.out.println(r.getAttemptDate() + " | " + r.getQuizTitle() + " | skor=" + r.getTotalScores())
            );
        }
    }
