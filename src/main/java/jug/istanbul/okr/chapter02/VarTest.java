package jug.istanbul.okr.chapter02;

public class VarTest {
    public static void main(String[] args) {
        // x * y işleminin sonucu hangi veri tip olur?
        int x = 1;
        long y = 33;
        var z = x * y;
        System.out.println(z);
    }

}
