package jug.istanbul.okr.chapter06;

public abstract class Whale {

    public abstract void dive();

    public static void main(String[] args) {
        Whale whale = new Orca();
        //whale.dive(3);
    }
}

class Orca extends Whale {
    static public int MAX = 3;
    public void dive() {
        System.out.println("Orca diving ");
    }

    public void dive(int... depth) {
        System.out.println("Orca diving deeper "+MAX);
    }
}
