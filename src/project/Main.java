package project;

import project.logic.BookLogic;
import project.logic.StudentUserLogic;
import project.model.Book;
import project.model.StudentUser;
import project.userinterface.BookUi;
import project.userinterface.StudentUserUi;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	/*Add stud
	* */

        int choice =0;

        do {
            System.out.println("1. Student\n" +
                               "2. Books\n" +
                               "0. Exit"  );
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    displayStudent();
                    break;
                case 2:
                    displayBooks();
                    break;

            }
        } while (choice != 0);
    }
    public static void displayStudent(){
        int choice =0;

        do {
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    StudentUser student = new StudentUserUi().getStudent();
                    new StudentUserLogic().add(student);
                    break;
                case 2:
                    StudentUser student1 = new StudentUserUi().getStudRegNo();
                    new StudentUserLogic().delete(student1);
                    break;
                case 3:
                    StudentUser student2 = new StudentUserUi().getStudRegNo();
                    new StudentUserLogic().search(student2);
                    break;
            }


        } while(choice !=0 );
    }
    public static void displayBooks() throws SQLException, ClassNotFoundException {
        int choice =0;

        do {
            System.out.println("1. Add Books");
            System.out.println("2. Delete Books");
            System.out.println("3. Search Books");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    Book book = new BookUi().getBook();
                    new BookLogic().add(book);
                    break;
                case 2:
                    Book book1 = new BookUi().getBookRegNo();
                    new BookLogic().delete(book1);
                    break;
                case 3:
                    Book book2 = new BookUi().getBookRegNo();
                    new BookLogic().search(book2);
                    break;
            }


        } while(choice !=0 );
    }

}
