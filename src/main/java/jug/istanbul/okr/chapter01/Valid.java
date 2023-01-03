package jug.istanbul.okr.chapter01;

public class Valid {


    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // x is initialized here
        int z; // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    public static void main(String[] args) {
        Valid valid = new Valid();
        System.out.println(valid.valid());
    }
}
