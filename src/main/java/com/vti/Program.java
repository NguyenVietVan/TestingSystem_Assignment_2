package com.vti;

public class Program {public static void main(String[] args) {

    // Tạo Department
    Department dep1 = new Department();
    dep1.id = 1;
    dep1.name = "Sale";

    // Tạo Position
    Position pos1 = new Position();
    pos1.name = "Dev";

    Position pos2 = new Position();
    pos2.name = "Tes";

    // Tạo Group
    Group group1 = new Group();
    group1.name = "Java Fresher";

    Group group2 = new Group();
    group2.name = "C# Fresher";

    Group group3 = new Group();
    group3.name = "Testing";

    // Account 1
    Account account1 = new Account();
    account1.position = pos1;

    // Account 2
    Account account2 = new Account();
    account2.department = null;
    account2.groups = new Group[]{group1, group2};

    // Gọi các method
    question1(account2);
    question2(account2);
    question3(account2);
    question4(account1);
}

    // =========================
    // Question 1
    // =========================
    public static void question1(Account account2) {

        if (account2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);
        }
    }

    // =========================
    // Question 2
    // =========================
    public static void question2(Account account2) {

        if (account2.groups == null || account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        }     if (account2.groups == null || account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account2.groups.length <= 2) {

            System.out.println("Group của nhân viên này là:");
            for (Group group : account2.groups) {
                System.out.println(group.name);
            }
// dùng vòng lặp for-each dùng để duyệt từng phần tử trong mảng

    } else if (account2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (account2.groups.length == 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    // =========================
    // Question 3 (Ternary)
    // =========================
    public static void question3(Account account2) {

        String result = (account2.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account2.department.name;

        System.out.println(result);
    }

    // =========================
    // Question 4 (Ternary)
    // =========================
    public static void question4(Account account1) {

        String result = (account1.position.name.equals("Dev"))
                ? "Đây là Developer"
                : "Người này không phải là Developer";

        System.out.println(result);
    }
}
// =========================
// Các class


class Department {
    int id;
    String name;
}

class Position {
    String name;
}

class Group {
    String name;
}

class Account {
    Department department;
    Position position;
    Group[] groups;
}
