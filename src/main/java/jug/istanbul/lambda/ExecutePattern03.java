package jug.istanbul.lambda;


import java.util.function.Consumer;

class Resource3  {

    // Library

    private Resource3() {
        System.out.println("Creating");
    }

    public Resource3 opt1() {
        System.out.println("opt1 ");
        return this;
    }

    public Resource3 opt2() {
        System.out.println("opt2 ");
        return this;
    }

    private void close() {
        System.out.println("closing ... ");
    }

    public static void run(Consumer<Resource3> resource3Consumer) {
        Resource3 resource3 = new Resource3();

        try {
            resource3Consumer.accept(resource3);

        } finally {
            resource3.close();
        }
    }
}

public class ExecutePattern03 {

    /**
     * Client ve Library ilişkisi
     *
     * @param args
     */

    public static void main(String[] args) {

       Resource3.run(resource3 -> resource3.opt2().opt1());


    }
}
