package jug.istanbul.okr.chapter03;

public class Page209 {

    void print(int category) {
        var type = switch(category) {
            case 1,2 -> "Snake";
            case 3,4 -> "Lizard";
            case 5,6 -> "Turtle";
            case 7,8 -> "Alligator";
            default -> throw new IllegalStateException("Unexpected value: " + category);
        };
        System.out.print(type);
    }

    public static void main(String[] args) {
        Page209 page209 = new Page209();
        page209.print(6);
    }

    public void prove() {
        byte elma = 5;
        short armut = 10;
        int sonuc= elma+ armut;
    }
}
