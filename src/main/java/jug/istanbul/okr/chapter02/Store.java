package jug.istanbul.okr.chapter02;

public class Store  {
    static double add(double fruit, float vegetables) {
        return fruit + vegetables;
    }
 
    // write a simple sum method hello

    public static void main(String[] args) {
        System.out.print(add(1.4, 2.4f) + ", ");
        System.out.print(add(1.9, (float) 4) + ", ");
        System.out.print(add((long) (int) (short) 2, (float) 4));
    }
}

