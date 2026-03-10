package com.vti.exercise;
import com.vti.entity.ProgramData;
import com.vti.entity.*;
import java.time.format.DateTimeFormatter;
public class Exercise3 {
    // Question 1
    public static void question1() {
        Exam exam1 = ProgramData.exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ExamID: " + exam1.examId);
        System.out.println("Title: " + exam1.title);
        System.out.println("Create Date: " + exam1.createDate.format(formatter));
    }
    // Question 2
    public static void question2() {
        Exam exam1 = ProgramData.exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Exam created at: " + exam1.createDate.format(formatter));
    }
    // Question 3
    public static void question3() {
        Exam exam1 = ProgramData.exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println("Year: " + exam1.createDate.format(formatter));
    }
    // Question 4
    public static void question4() {
        Exam exam1 = ProgramData.exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println("Month/Year: " + exam1.createDate.format(formatter));
    }
    // Question 5
    public static void question5() {
        Exam exam1 = ProgramData.exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        System.out.println("Date: " + exam1.createDate.format(formatter));
    }
}
