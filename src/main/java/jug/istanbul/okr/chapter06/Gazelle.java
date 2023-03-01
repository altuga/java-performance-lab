package jug.istanbul.okr.chapter06;

class Antelope {

    public Antelope(int p) {
        System.out.print("4");
    }

    {  System.out.print("2"); }    

}

public class Gazelle extends Antelope {

    public Gazelle(int p) {
        super(6);
        System.out.print("3");
    }

    public static void main(String hopping[]) {
        new Gazelle(0);
    }

    static { System.out.print("8");}
}