package jug.istanbul.okr.chapter07;

public class Favorites {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;

        static final Flavors DEFAULT = STRAWBERRY;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values())
            System.out.print(e.ordinal() + " ");
    }
}
