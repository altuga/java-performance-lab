package jug.istanbul.okr.chapter02;

public class Hello {

    public static void run() {
        int elma = (short)4;
        elma = elma++;
        long armut = (int)2;
        armut -= 1.0;
        System.out.print(elma + " | " + armut);
    }

    public static void main(String[] args) {
        run();
    }
}

