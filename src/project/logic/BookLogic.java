package project.logic;

import project.model.Book;
import project.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookLogic implements CrudI<Book> {

    DbUtil db = new DbUtil();

    public BookLogic() throws SQLException, ClassNotFoundException {
    }


    @Override
    public List<Book> search(Book book) {
        List<Book> books = new ArrayList<>();

        try {

            ResultSet results = db.readData("SELECT * FROM tbl_books where refNo = '"+book.getRefNo()+"' ");
            while(results.next()){
                book.setSubject(results.getString("bookSubject"));
                book.setBookName(results.getString("bookName"));
                book.setAuthor(results.getString("bookAuthor"));
                book.setRefNo(results.getString("bookRefNo"));
                book.setNumber(results.getInt("quantity"));

                books.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return books;

    }

    @Override
    public boolean delete(Book book) {
        int results= 0;
        try {
            results = db.writeData("DELETE FROM tbl_books where bookRefNo = '"+book.getRefNo()+ "'");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return results ==1;
    }


    @Override
    public boolean add(Book book) {
        int results = 0;
        try {
            results = db.writeData("INSERT INTO tbl_books(bookSubject,bookName,bookAuthor,bookRefNo,quantity) VALUES ('"+book.getSubject()+ "', '"+book.getBookName()+ "', '"+
                    book.getAuthor()+ "', '"+book.getRefNo()+ "', '"+book.getNumber()+ "')");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return results ==1;
    }
}
