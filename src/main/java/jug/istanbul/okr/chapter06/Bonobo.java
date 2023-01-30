package jug.istanbul.okr.chapter06;

public class Bonobo {
    public Bonobo(String  food) { // DOES NOT COMPILE
        System.out.println(food);
    }

    public static void main(String[] args) {
        Bonobo bonobo = new Bonobo("hello");
    }
}