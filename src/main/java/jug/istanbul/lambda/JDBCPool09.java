package jug.istanbul.lambda;

import java.util.function.Consumer;

public class JDBCPool09 {

    private JDBCPool09() {
        System.out.println(" init ok");
    }

    public JDBCPool09 getConn() {
        System.out.println(" conn is ok ");
        return this;
    }

    public JDBCPool09 checkHealth() {
        System.out.println("health is ok");
        return this;
    }

    private void close() {
        System.out.println(" closed");
    }

    public static void run(Consumer<JDBCPool09> consumer) {
        JDBCPool09 jdbcPool09 = new JDBCPool09();
        try {
            consumer.accept(jdbcPool09);
        } catch (Exception ex) { // Exception yakalmak ne demek  ?? Hangi exception , bir cisim yaklasiyor
            System.out.println(" beholder at");
        } finally {
            jdbcPool09.close();
        }
    }

}

class Main09 {


    public static void main(String[] args) {
        JDBCPool09.run(jdbcPool09 -> jdbcPool09.checkHealth().getConn());
    }

}
