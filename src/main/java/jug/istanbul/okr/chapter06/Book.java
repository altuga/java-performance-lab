package jug.istanbul.okr.chapter06;

public class Book {
    StringBuilder value = new StringBuilder("t");
    {
        value.append("a");
        value.append("c");
    }

    private Book() {
        value.append("b");
    }

    public Book(String s) {
        this();
        value.append(s);
    }

    public static void main(String[] args) {
        Object bear = new Book();
        bear = new Book("f");
        System.out.println(((Book) bear).value);
    }
}