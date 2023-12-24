package jug.istanbul;


import java.util.function.Consumer;

public class JDBCPool08 {
    private JDBCPool08() {
        System.out.println("JDBCPool08 initialized ");
    }

    public JDBCPool08 healthCheck() {
        System.out.println(" Health Check is done");
        return this;

    }

    public JDBCPool08 getConn() {
        System.out.println("Connection is given");
        return this;

    }

    private void close()  {
        System.out.println(" close ...");
    }

    public static void run(Consumer<JDBCPool08> consumer) {
        JDBCPool08 jdbcPool08 = new JDBCPool08();
        try {
            consumer.accept(jdbcPool08);
        } catch (Exception ex) {
            System.out.println(" loglandı");
        } finally {
            jdbcPool08.close();
        }
    }


}


class Main {

    public static void main(String[] args) {

      JDBCPool08.run( e->e.healthCheck().getConn());



    }
}
