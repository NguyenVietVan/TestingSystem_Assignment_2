package com.vti.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProgramData {
    public static Department[] departments;
    public static Account[] accounts;
    public static Group[] groups;
    public static Exam[] exams;

    public static void initData(){
        // exam
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "EX001";
        exam1.title = "Java Basic";
        exam1.duration = 60;
        exam1.createDate = LocalDateTime.now();

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "EX002";
        exam2.title = "SQL Test";
        exam2.duration = 90;
        exam2.createDate = LocalDateTime.now();

        exams = new Exam[]{exam1, exam2};

        // Department
        Department d1 = new Department();
        d1.departmentId = 1;
        d1.departmentName = "Sale";

        Department d2 = new Department();
        d2.departmentId = 2;
        d2.departmentName = "Marketing";

        departments = new Department[]{d1, d2};
        // Account
        Account a1 = new Account();
        a1.accountId = 1;
        a1.email = "a@gmail.com";
        a1.userName = "nguyenvana";
        a1.fullName = "Nguyen Van A";
        a1.department = d1;
        a1.position = Position.DEV;
        a1.createDate = LocalDate.now();
        Account a2 = new Account();
        a2.accountId = 2;
        a2.email = "b@gmail.com";
        a2.userName = "nguyenvanb";
        a2.fullName = "Nguyen Van B";
        a2.department = d2;
        a2.position = Position.TEST;
        a2.createDate = LocalDate.now();

        accounts = new Account[]{a1, a2};
        // Group
        Group g1 = new Group();
        g1.groupId = 1;
        g1.groupName = "Java Fresher";
        g1.accounts = accounts;
        g1.creator = a1;
        g1.createDate = LocalDate.now();
        groups = new Group[]{g1};

    }
    }
