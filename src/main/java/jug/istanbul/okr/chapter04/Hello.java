package jug.istanbul.okr.chapter04;

import java.util.Arrays;

public class Hello {

    public static void main(String args[]) {

        String[] s1 = { "A", "B", "C" };
        String[] s2 = { "A", "C", "B" };
        String[] s3 = { "A" };
        String[] s4 = { "A", null };
        System.out.println(Arrays.compare(s1, s2)); // -1  
        System.out.println(Arrays.mismatch(s1, s2)); // 1
        System.out.println(Arrays.compare(s3, s4)); // -1
        System.out.println(Arrays.mismatch(s3, s4)); // 1
        System.out.println(Arrays.compare(s4, s4)); // 0
        System.out.println(Arrays.mismatch(s4, s4)); // -1


    }

}