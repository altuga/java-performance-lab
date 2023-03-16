package jug.istanbul.okr.chapter02;

public class VarTest {
    
    public static void main(String[] args) {
        // x * y işleminin sonucu hangi veri tip olur?
        double x = 39.21;
        float y = 2.1f;
        var z = x + y;
        System.out.println(z);
    }

   
    /*public static void main(String[] args) {
        // x * y işleminin sonucu hangi veri tip olur?
        int x = 1;
        long y = 33;
        var z = x * y;
        System.out.println(z);
    }*/

}
