package com.vti.exercise;
import com.vti.entity.ProgramData;
import com.vti.entity.Account;
import com.vti.entity.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Random;
public class Exercise5 {static Scanner scanner = new Scanner(System.in);

    // Question 1
    // Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
    public static void question1() {
        System.out.println("Nhập số thứ 1:");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ 2:");
        int b = scanner.nextInt();
        System.out.println("Nhập số thứ 3:");
        int c = scanner.nextInt();
        System.out.println("Bạn vừa nhập: " + a + " " + b + " " + c);
    }
    // Question 2
    // Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public static void question2() {
        System.out.println("Nhập số thực thứ 1:");
        double a = scanner.nextDouble();
        System.out.println("Nhập số thực thứ 2:");
        double b = scanner.nextDouble();
        System.out.println("Hai số vừa nhập: " + a + " và " + b);
    }
    // Question 3
    // Viết lệnh cho phép người dùng nhập họ và tên
    public static void question3() {
        scanner.nextLine(); // clear buffer
        System.out.println("Nhập họ và tên:");
        String name = scanner.nextLine();
        System.out.println("Họ và tên của bạn là: " + name);
    }
    // Question 4
    // Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public static void question4() {
        System.out.println("Nhập năm sinh:");
        int year = scanner.nextInt();
        System.out.println("Nhập tháng sinh:");
        int month = scanner.nextInt();
        System.out.println("Nhập ngày sinh:");
        int day = scanner.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);
        System.out.println("Ngày sinh của bạn là: " + birthday);
    }


    // Question 5
    // Cho phép người dùng tạo Account
    public static void question5() {
        Account account = new Account();
        scanner.nextLine();
        System.out.println("Nhập email:");
        account.email = scanner.nextLine();
        System.out.println("Nhập username:");
        account.userName = scanner.nextLine();
        System.out.println("Nhập full name:");
        account.fullName = scanner.nextLine();
        System.out.println("Chọn Position:");
        System.out.println("1.Dev");
        System.out.println("2.Test");
        System.out.println("3.ScrumMaster");
        System.out.println("4.PM");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                account.position = Position.DEV;
                break;
            case 2:
                account.position = Position.TEST;
                break;
            case 3:
                account.position = Position.SCRUM_MASTER;
                break;
            case 4:
                account.position = Position.PM;
                break;
            default:
                System.out.println("Không hợp lệ");
        }

        System.out.println("Account đã tạo:");
        System.out.println(account.fullName + " - " + account.position);
    }
    // Question 6
    // Cho phép người dùng tạo Department
    public static void question6() {
        Department department = new Department();
        scanner.nextLine();
        System.out.println("Nhập ID department:");
        department.departmentId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên department:");
        department.departmentName = scanner.nextLine();
        System.out.println("Department đã tạo:");
        System.out.println(department.departmentId + " - " + department.departmentName);
    }
    // Question 7
// Nhập số chẵn từ console
    public static void question7() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập một số chẵn:");
            number = scanner.nextInt();
            if (number % 2 != 0) {
                System.out.println("Đây không phải số chẵn, nhập lại!");
            }
        } while (number % 2 != 0);
        System.out.println("Số chẵn bạn vừa nhập: " + number);
    }
    // Question 8
// Menu tạo Account hoặc Department
    public static void question8() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập chức năng muốn sử dụng:");
            System.out.println("1. Tạo Account");
            System.out.println("2. Tạo Department");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    question5();
                    break;
                case 2:
                    question6();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại!");
            }
        }
    }
    // Question 9
// Thêm group vào account
    public static void question9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách username:");
        for (Account acc : ProgramData.accounts) {
            System.out.println(acc.userName);
        }
        System.out.println("Nhập username:");
        String username = scanner.nextLine();
        Account account = null;
        for (Account acc : ProgramData.accounts) {
            if (acc.userName.equals(username)) {
                account = acc;
            }
        }
        System.out.println("Danh sách group:");
        for (Group group : ProgramData.groups) {
            System.out.println(group.groupName);
        }
        System.out.println("Nhập tên group:");
        String groupName = scanner.nextLine();
        for (Group group : ProgramData.groups) {
            if (group.groupName.equals(groupName)) {
                System.out.println("Đã thêm " + username + " vào group " + groupName);
            }
        }
    }
    // Question 10

    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập chức năng:");
            System.out.println("1. Tạo Account");
            System.out.println("2. Tạo Department");
            System.out.println("3. Thêm Group vào Account");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    question5();
                    break;
                case 2:
                    question6();
                    break;
                case 3:
                    question9();
                    break;
                default:
                    System.out.println("Nhập sai!");
            }
            scanner.nextLine();
            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                return;
            }
        }
    }
    // Question 11
    public static void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách username:");
        for (Account acc : ProgramData.accounts) {
            System.out.println(acc.userName);
        }
        System.out.println("Nhập username:");
        String username = scanner.nextLine();
        Random random = new Random();
        int index = random.nextInt(ProgramData.groups.length);
        Group randomGroup = ProgramData.groups[index];
        System.out.println("Account " + username +
                " đã được thêm vào group: " + randomGroup.groupName);
    }
}
