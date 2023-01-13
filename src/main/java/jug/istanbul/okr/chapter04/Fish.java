package jug.istanbul.okr.chapter04;

public class Fish {
    public static void main(String[] args) {
        int numFish = 4;
        String fishType = "tuna";
        // String anotherFish = numFish + 1;
        //System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);

        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }
}
