package project.userinterface;

import project.model.StudentUser;

import java.util.Scanner;

public class StudentUserUi {
    Scanner sc = new Scanner(System.in);

    public StudentUser getStudent(){
        StudentUser student = new StudentUser();
        System.out.println("Enter The Reg number:");
        student.setRegNo(sc.nextLine());
        System.out.println("Enter The Name:");
        student.setName(sc.nextLine());
        System.out.println("Enter The Course: ");
        student.setCourse(sc.nextLine());

        return student;
    }
    public StudentUser getStudRegNo(){
        StudentUser student = new StudentUser();
        System.out.println("Enter The Reg number:");
        student.setRegNo(sc.nextLine());

        return student;
    }

}

