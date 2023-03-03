package jug.istanbul.okr.chapter07;

public record Crane(int numberEggs, String name) {

}

class TestCrane {

    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs()); // 4
        System.out.println(mommy.name()); // Cammy
    }
}