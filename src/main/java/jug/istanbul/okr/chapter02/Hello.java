package jug.istanbul.okr.chapter02;

public class Hello {

    public static void run() {
        //region elmalar toplandı
        int elma = (short)4;
        elma = elma++;
        //endregion


        //region Description
        long armut = (int)2;
        armut -= 1.0;
        //endregion
        System.out.print(elma + " | " + armut);
    }

    // write a method that counts  ends with  "r" and "s"  for the input
    // use regex


    public static int countRS2(String input) {
        //region step 1 count is set
        int count = 0;
        //endregion

        //region step 2 for dongusu
        for (int i = 0; i < input.length(); i++) {
            //region gerekli kontroller
            if (input.charAt(i) == 'r' || input.charAt(i) == 's') {
                count++;
            }
            //endregion
        }
        //endregion
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

