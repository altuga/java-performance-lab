package jug.istanbul.okr.chapter06;

public class Animal {
    private int age;
    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
    }

    public static void main(String[] args) {
        Animal animal  = new Animal(5);
    }
}
