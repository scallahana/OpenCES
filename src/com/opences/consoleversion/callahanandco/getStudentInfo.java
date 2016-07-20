package com.opences.consoleversion.callahanandco;
import java.util.Scanner;
/**
 * @author Anthony Callahan
 * created at 07-19-2016
 * This is the main file that will call other classes this will get all of the
 * student information and begin choosing classes for the student.
 */

class studentInfo {
    private String name;
    private String city;
    private int dateOfBirth;
    private int age;

    private Scanner sc = new Scanner(System.in);

    void setName() {
        System.out.println("Hello what is your name?");
        name = sc.nextLine();
        System.out.println("Nice to meet you " + name);
        // setAge();
    }
}

