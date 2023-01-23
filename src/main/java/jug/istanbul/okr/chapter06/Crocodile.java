package jug.istanbul.okr.chapter06;

public class Crocodile {
    protected int speed = 20;
    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args ) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); 
    }
}
