package com.vti.exercise;
import com.vti.entity.ProgramData;
import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    // Question 1: random số nguyên
    public static void question1() {
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Random Integer: " + number);
    }
    // Question 2: random số thực
    public static void question2() {
        Random random = new Random();
        double number = random.nextDouble();
        System.out.println("Random Double: " + number);
    }
    // Question 3: random tên trong array
    public static void question3() {
        String[] students = {
                "An", "Binh", "Cuong", "Dung", "Huy"
        };
        Random random = new Random();
        int index = random.nextInt(students.length);
        System.out.println("Random Student: " + students[index]);
    }
    // Question 4: random ngày từ 24-07-1995 → 20-12-1995
    public static void question4() {
        Random random = new Random();
        LocalDate start = LocalDate.of(1995, 7, 24);
        LocalDate end = LocalDate.of(1995, 12, 20);
        long startDay = start.toEpochDay();
        long endDay = end.toEpochDay();
        long randomDay = startDay + random.nextInt((int)(endDay - startDay));
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random Date: " + randomDate);
    }

    // Question 5: random ngày trong 1 năm gần đây
    public static void question5() {
        Random random = new Random();
        LocalDate now = LocalDate.now();
        LocalDate oneYearAgo = now.minusYears(1);
        long startDay = oneYearAgo.toEpochDay();
        long endDay = now.toEpochDay();
        long randomDay = startDay + random.nextInt((int)(endDay - startDay));
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random Date in last year: " + randomDate);
    }

    // Question 6: random ngày trong quá khứ
    public static void question6() {
        Random random = new Random();
        LocalDate now = LocalDate.now();
        long randomDay = random.nextInt((int) now.toEpochDay());
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random Past Date: " + randomDate);
    }

    // Question 7: random số có 3 chữ số
    public static void question7() {
        Random random = new Random();
        int number = 100 + random.nextInt(900);
        System.out.println("Random 3-digit number: " + number);
    }
}