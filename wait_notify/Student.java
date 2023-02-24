/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dqt1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author student
 */
public class Student {

    private String rollNo;
    private String fullName;
    private String className;

    private static boolean checkRollNo(String testRollNo) {
        String patternStr = "^[C]\\d{4}[A-Z]\\d{4}$";
        String patternrollNo = "";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(testRollNo);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    private static boolean checkClassName(String testClassName) {
        String patternStr = "^[C]\\d{4}[A-Z]{1,2}$";
        String patternrollNo = "";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(testClassName);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public void nhapThongTin() {
        Scanner in = new Scanner(System.in);
        System.out.println("    NHAP THONG TIN  ");

        while (true) {
            System.out.println("Nhap RollNo: ");
            this.rollNo = in.nextLine();
            if (checkRollNo(rollNo)) {
                break;
            }
        }

        System.out.println("Nhap Fullname: ");
        this.fullName = in.nextLine();

        while (true) {
            System.out.println("Nhap ClassName: ");
            this.className = in.nextLine();
            if (checkClassName(className)) {
                break;
            }
        }

    }

    public void hienThongTin() {
        String msg = String.format("%s    %s    %s", rollNo, fullName, className);
        System.out.println(msg);
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student() {
    }

    public Student(String rollNo, String fullName, String className) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.className = className;
    }

}
