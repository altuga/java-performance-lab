package jug.istanbul.lambda;


import java.util.function.Consumer;

class JDBCPool  {
    private JDBCPool() {
        System.out.println("created");
    }

    public JDBCPool getConnection() {
        System.out.println("connection created");
        return this;
    }

    public void doWork() {
        System.out.println("do Work");

    }

    private  void close() {
        System.out.println("connection closed");
        // ...
    }

    public static  void run(Consumer<JDBCPool>... comments) {
        JDBCPool jdbcPool = new JDBCPool();
        try {
            for (Consumer<JDBCPool> comment : comments) {
                comment.accept(jdbcPool);
            }

        } finally {
            jdbcPool.close();
        }
    }


}

public class ExecutePattern04 {

    // kaynak ve kaynagi kullanan bir client


    public static void main(String[] args) {
        JDBCPool.run( jdbcPool -> jdbcPool.getConnection(),
                jdbcPool -> jdbcPool.doWork());



    }

}
