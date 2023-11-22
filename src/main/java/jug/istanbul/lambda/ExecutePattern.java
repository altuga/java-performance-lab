package jug.istanbul.lambda;


import java.util.function.Consumer;

class Resource  {

    private Resource() {
        System.out.println("Creating");
    }

    public Resource opt1() {
        System.out.println("opt1");
        return this;
    }

    public Resource opt2() {
        System.out.println("opt2");
        return this;
    }

    private void close() {
        System.out.println("cleaning ...");
    }

    public static void use(Consumer<Resource> block) {
        //region  loan pattern , hizmet saglayan sorumlulugunu yerine getirmeli
        Resource resource = new Resource();
        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}

public class ExecutePattern {
    public static void main(String[] args) {
        //region  client kapatmaktan sorumlu değil
        Resource.use(resource -> resource.opt1().opt2());

    }


}
