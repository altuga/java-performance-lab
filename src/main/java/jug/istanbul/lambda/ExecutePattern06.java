package jug.istanbul.lambda;


import java.net.ConnectException;
import java.util.function.Consumer;

class JDBCPool08  {

    private  JDBCPool08() {
        System.out.println("JDBCPool created");
    }

    public JDBCPool08 getCon() {
        System.out.println("Connection is created");
        return this;
    }

    public JDBCPool08 healthCheck() {
        System.out.println("Connection health checking ...");
        return this;
    }

    private  void close() {
        System.out.println("Connection is closed");
    }

    public static void run(Consumer<JDBCPool08> jdbcPool08Consumer) {
        JDBCPool08 jdbcPool08 = new JDBCPool08();
        try {
            jdbcPool08Consumer.accept(jdbcPool08);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            jdbcPool08.close();
        }
    }
}

public class ExecutePattern06 {

    /**
     * JDBCPool - resource
     * get connection from the pool
     * close the connection
     */

    public static void main(String[] args) {

        JDBCPool08.run(e-> e.getCon().healthCheck());


    }

}
