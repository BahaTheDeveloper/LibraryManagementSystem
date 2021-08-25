package project.model;

public class Book {
    String subject;
    String bookName;
    String author;
    String refNo;
    int number;

    public Book() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Books{" +
                "subject='" + subject + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", refNo='" + refNo + '\'' +
                ", number=" + number +
                '}';
    }
}

