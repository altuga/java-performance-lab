package jug.istanbul.okr.chapter08;

public class Book implements BookCategory{

    private final int pageNumber;
    private final String writer;

    public Book(int pageNumber, String writer) {
        this.pageNumber = pageNumber;
        this.writer = writer;
    }

    public boolean isBigBook(Book book) {
        if (book.pageNumber > 1000) {
            return true;
        }
        return false;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getWriter() {
        return writer;
    }


    @Override
    public String toString() {
        return "Book{" +
                "pageNumber=" + pageNumber +
                ", writer='" + writer + '\'' +
                '}';
    }
}
