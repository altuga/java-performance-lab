package jug.istanbul.okr;

public class Page108 {

    /*The code does not compile. Remember that for local variable type inference, the compiler
    looks only at the line with the declaration. Since question and answer are not assigned
    values on the lines where they are de!ned, the compiler does not know what to make of
    them. For this reason, both lines 4 and 6 do not compile. */

    public void doesThisCompile(boolean check) {
        //var question;
        // question = 1;
        //var answer;

        if (check) {
        //    answer = 2;
        } else {
         //   answer = 3;
        }

        // System.out.println(answer);
    }

}
