package jug.istanbul.lambda;

import java.util.function.Consumer;

/**
 * API üreten ve API kullanan arasında güvenli iletişim sağlamak
 */
class Resource2 {
    private Resource2() {
        System.out.println("Resource2");
    }

    public Resource2 op1() {
        System.out.println("op1");
        return this;
    }

    public Resource2 op2() {
        System.out.println("op2");
        return this;
    }

    public static void run(Consumer<Resource2> block) {
        Resource2 resource2 = new Resource2();
        try {
            block.accept(resource2);
        } finally {
            resource2.close();
        }
    }

    private void close() {
        System.out.println("Resource2 is closing");
    }

}

public class ExecutePattern2 {

    public static void main(String[] args) {
        // Client API
        Resource2.run(resource2 -> resource2.op1().op2());


    }
}
