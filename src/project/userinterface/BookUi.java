package project.userinterface;

import project.model.Book;
import project.model.StudentUser;

import java.util.Scanner;

public class BookUi {

    Scanner sc = new Scanner(System.in);
    public Book getBook(){
        Book book = new Book();

        System.out.println("Enter The Subject:");
        book.setSubject(sc.nextLine());
        System.out.println("Enter the Book Name:");
        book.setBookName(sc.nextLine());
        System.out.println("Enter the Book Ref No:");
        book.setRefNo(sc.nextLine());
        System.out.println("Enter the author of the book:");
        book.setAuthor(sc.nextLine());
        System.out.println("Enter the Book Quantity:");
        book.setNumber(sc.nextInt());

     return book;
    }

    public Book getBookRegNo(){
        Book book = new Book();
        System.out.println("Enter the Ref No::");
        book.setRefNo(sc.nextLine());

        return book;
    }

}
