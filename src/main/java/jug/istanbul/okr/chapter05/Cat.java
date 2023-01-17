package jug.istanbul.okr.chapter05;

public class Cat {
    public void meow(String s) {
        System.out.print("string");
    }
    public void meow(Object o) {
        System.out.print("object");
    }
    public static void main(String[] args) {
        var p = new Cat();
        p.meow("test");
        System.out.print("- ");
        p.meow(56);
    }
}
