package jug.istanbul.okr.chapter02;

public class Hello {

    public static void run() {
        int elma = (short)4;
        elma = elma++;
        long armut = (int)2;
        armut -= 1.0;
        System.out.print(elma + " | " + armut);
    }

    // write a method that counts  ends with  "r" and "s"  for the input
    // use regex


    public static int countRS2(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'r' || input.charAt(i) == 's') {
                count++;
            }
        }
        return count;
    }

    public static int countRS3(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'r' || c == 's') {
                count++;
            }
        }
        return count;
    }

    public static int countRS4(String input) {
        return (int) input.chars()
                .filter(c -> c == 'r' || c == 's')
                .count();
    }
   





     

   




    public static void main(String[] args) {
        run();
    }
}

