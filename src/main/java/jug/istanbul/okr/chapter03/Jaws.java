package jug.istanbul.okr.chapter03;

public class Jaws {

    static void getFish(Object fish) {
        if (!(fish instanceof String guppy))
            System.out.print("Eat!");
        else if (!(fish instanceof String puppyy)) {
            throw new RuntimeException();
        }
        System.out.print("Swim!");
    }

    public static void main(String[] args) {
        getFish("goldie");
        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        if (older = true)
            System.out.println("Success");
        else
            System.out.println("Failure");
    }

    /**
     * F. Line 19 starts with an else statement, but there is no preceding if statement that it
     * matches. For this reason, line 19 does not compile, making option F the correct answer. If the
     * else keyword was removed from line 19, then the code snippet would print Success.
     */


     public void operate() {
        int sing = 8, squawk = 2, notes = 0;
         while(sing > squawk) {
            sing-- ;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);
     }

}
