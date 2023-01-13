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
        //page209.run();
       //page209.print(6);
        System.out.println("\n");

        var name = "James";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n Score: %f out of %d"
                .formatted(name, score, total));

        var str = "Food: %d ".formatted(2.0);
        System.out.println(str);
    }

    public void prove() {
        byte elma = 5;
        short armut = 10;
        int sonuc= elma+ armut;
    }

    public void run() {
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true) System.out.println("Success");
        else System.out.println("Failure");

    }
}
