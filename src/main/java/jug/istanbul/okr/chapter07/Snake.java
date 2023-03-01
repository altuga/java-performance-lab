package jug.istanbul.okr.chapter07;


public sealed class Snake permits Cobra {
    protected boolean getTroutName() {
        return true;
    }
}

final class Cobra extends Snake {

    public void printName(Snake snake) {
        System.out.println(switch (snake) {
            case Cobra c -> c.getBassName();
            case Snake s -> s.getTroutName();
        });
    }

    private boolean getBassName() {
        return false;
    }
}

final class TestSnake {
    public static void main(String[] args) {
        Cobra cobra = new Cobra();
        cobra.printName(cobra);
    }
}