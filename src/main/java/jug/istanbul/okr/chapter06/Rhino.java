package jug.istanbul.okr.chapter06;

public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }

   
}

class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }

    public static void main(String[] args) {
        JavanRhino javanRhino = new JavanRhino();
        System.out.println(javanRhino.getName() );

    }

}
