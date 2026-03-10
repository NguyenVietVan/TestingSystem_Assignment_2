package com.vti.exercise;
import com.vti.entity.*;
import com.vti.entity.ProgramData;
import com.vti.entity.Account;

public class Exercise1 {            // Question 1
    public static void question1() {
        Account acc2 = ProgramData.accounts[1];
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: "
                    + acc2.department.departmentName);
        }
    }

    // Question 2
    public static void question2() {
        Account acc2 = ProgramData.accounts[1];
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
            System.out.print("Group của nhân viên này là: ");
            for (Group g : acc2.groups) {
                System.out.print(g.groupName + " ");
            }
            System.out.println();
        } else if (acc2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    // Question 3
    public static void question3() {
        Account acc2 = ProgramData.accounts[1];
        String result = (acc2.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + acc2.department.departmentName;
        System.out.println(result);
    }

    // Question 4
    public static void question4() {
        Account acc1 = ProgramData.accounts[0];
        String result = (acc1.position == Position.DEV)
                ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(result);
    }

    // Question 5
    public static void question5() {
        int count = ProgramData.groups[0].accounts.length;
        switch (count) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

    // Question 6
    public static void question6() {
        Account acc2 = ProgramData.accounts[1];
        int count = (acc2.groups == null) ? 0 : acc2.groups.length;
        switch (count) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện");
        }
    }

    // Question 7
    public static void question7() {
        Account acc1 = ProgramData.accounts[0];
        switch (acc1.position) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }
    }

    // Question 8
    public static void question8() {
        for (Account acc : ProgramData.accounts) {
            System.out.println("Email: " + acc.email);
            System.out.println("FullName: " + acc.fullName);
            System.out.println("Department: " + acc.department.departmentName);
            System.out.println();
        }
    }

    // Question 9
    public static void question9() {
        for (Department dep : ProgramData.departments) {
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + dep.departmentName);
            System.out.println();
        }
    }

    // Question 10
    public static void question10() {
        for (int i = 0; i < ProgramData.accounts.length; i++) {
            Account acc = ProgramData.accounts[i];
            System.out.println("Thông tin account thứ " + (i + 1));
            System.out.println("Email: " + acc.email);
            System.out.println("Full name: " + acc.fullName);
            System.out.println("Phòng ban: " + acc.department.departmentName);
            System.out.println();
        }
    }

    // Question 11
    public static void question11() {
        for (int i = 0; i < ProgramData.departments.length; i++) {
            Department dep = ProgramData.departments[i];
            System.out.println("Thông tin department thứ " + (i + 1));
            System.out.println("Id: " + dep.departmentId);
            System.out.println("Name: " + dep.departmentName);
            System.out.println();
        }
    }

    // Question 12
    public static void question12() {
        for (int i = 0; i < 2; i++) {
            Department dep = ProgramData.departments[i];
            System.out.println(dep.departmentName);
        }
    }

    // Question 13
    public static void question13() {
        for (int i = 0; i < ProgramData.accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println(ProgramData.accounts[i].fullName);
        }
    }

    // Question 14
    public static void question14() {
        for (Account acc : ProgramData.accounts) {
            if (acc.accountId < 4) {
                System.out.println(acc.fullName);
            }
        }
    }
    // Question 15
    public static void question15() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Question 16
    public static void question16() {
        int i = 0;
        while (i < ProgramData.accounts.length) {
            System.out.println(ProgramData.accounts[i].fullName);
            i++;
        }
    }

    // Question 17
    public static void question17() {
        int i = 0;
        do {
            System.out.println(ProgramData.accounts[i].fullName);
            i++;
        } while (i < ProgramData.accounts.length);
    }
}
