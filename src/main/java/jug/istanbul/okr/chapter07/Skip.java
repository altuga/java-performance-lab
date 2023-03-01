package jug.istanbul.okr.chapter07;

public class Skip {
    public int skip() {
        return Hop.getJumpHeight();
    }

    public static void main(String[] args) {
        Skip skip = new Skip();
        System.out.println(skip.skip());
    }
}