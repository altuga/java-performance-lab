package jug.istanbul.okr.chapter06;

public class ZooKeeper {
    private String name = "BestZoo";    
    
    { System.out.print(name + "- "); }

    private static int COUNT = 0;
    
    static { System.out.print(COUNT + "- "); }
    
    static { COUNT += 10; System.out.print(COUNT + "- "); }
    
    public ZooKeeper() {
        System.out.print("z- ");
    }

    public static void main(String... patrons) {
        new ZooKeeper();
    }
}
