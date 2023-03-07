package jug.istanbul.okr.chapter07;

public record Crane(int numberEggs, String name) {


    public Crane {
        if (numberEggs< 5 ) {
            numberEggs = 9;
            System.out.println(" to low egg number");
        }
    }

    public int getNumberEggs() {
        System.out.println(" getNumberEggs " + this.numberEggs);
        return numberEggs;
    }
}

class TestCrane {

    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs()); // 9
        System.out.println(mommy.name()); // Cammy
        
    }
}