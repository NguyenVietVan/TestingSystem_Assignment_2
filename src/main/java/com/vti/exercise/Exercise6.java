package com.vti.exercise;
import com.vti.entity.ProgramData;
import com.vti.entity.*;

public class Exercise6 {
    // Question 1
    // Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void question1() {
        System.out.println("Các số chẵn nhỏ hơn 10:");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
    // Question 2
    // Tạo method để in thông tin các account
    public static void question2() {
        for (Account acc : ProgramData.accounts) {
            System.out.println("Account ID: " + acc.accountId);
            System.out.println("Email: " + acc.email);
            System.out.println("Full Name: " + acc.fullName);
            if (acc.department != null) {
                System.out.println("Department: " + acc.department.departmentName);
            }
            System.out.println("-------------------");
        }
    }
    // Question 3
    // Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public static void question3() {
        System.out.println("Các số nguyên dương nhỏ hơn 10:");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }
}
