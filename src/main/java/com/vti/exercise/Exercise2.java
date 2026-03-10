package com.vti.exercise;
import com.vti.entity.ProgramData;
import com.vti.entity.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Exercise2 {
    public static void question1() {

        // Question 1{

            int number = 5;

            System.out.printf("Số nguyên là: %d%n", number);

        }

        // Question 2
        public static void question2() {

            int number = 100000000;

            System.out.printf("Số là: %,d%n", number);

        }

        // Question 3
        public static void question3() {

            double number = 5.567098;

            System.out.printf("Số thực: %.4f%n", number);

        }

        // Question 4
        public static void question4() {

            String name = "Nguyễn Văn A";

            System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", name);

        }

        // Question 5
        public static void question5() {

            LocalDateTime now = LocalDateTime.now();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");

            System.out.println(now.format(formatter));

        }

        // Question 6
        public static void question6() {

            System.out.printf("%-5s %-25s %-20s %-15s%n",
                    "ID", "Email", "Full Name", "Department");

            for (Account acc : ProgramData.accounts) {

                System.out.printf("%-5d %-25s %-20s %-15s%n",
                        acc.accountId,
                        acc.email,
                        acc.fullName,
                        acc.department.departmentName);

            }

        }
}
