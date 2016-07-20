package com.opences.consoleversion.callahanandco;
import java.util.Calendar;
import java.util.Objects;
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
    private int year = Calendar.getInstance().get(Calendar.YEAR);

    /**
     * This gets the Users name and assigns it to the name variable.
     */
    void setName() {
        System.out.println("Hello what is your name?");
        name = sc.nextLine();
        System.out.println("Nice to meet you " + name);
        setDateOfBirth();
    }

    /**
     * This gets the users Date of birth and in int form and just the year so we can automate the age tasks
     * then this will begin an if statement to make sure the year of birth is correct.
     */
    private void setDateOfBirth() {
        Scanner scc = new Scanner(System.in);
        System.out.println(name + " What year were you born in?");
        dateOfBirth = sc.nextInt();
        System.out.println("You were born in " + dateOfBirth + " is this correct? (Yes or No).");
        String correct = scc.nextLine();
        if (Objects.equals(correct, "Yes")) {
            setAge();
        } else {
            editDateOfBirth();
        }
    }

    /**
     * This will allow the user to edit the date of birth, this will be available application wide.
     */
    private void editDateOfBirth() {
         System.out.print(dateOfBirth);
    }

    private void setAge() {
        age = (year - dateOfBirth);
        System.out.println("You are " + age + " years old is this correct?");
    }
}

