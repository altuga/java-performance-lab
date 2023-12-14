package jug.istanbul.lambda;


import java.util.function.Consumer;

class JDBCPool07  {

    private JDBCPool07() {
        System.out.println("JDBCPool07 is initialized");
    }

    public JDBCPool07 getCon() {
        System.out.println(" JDBCPool07 connect is ok");
        return this;
    }

    public JDBCPool07 checkHealth() {
        System.out.println(" JDBCPool07 connect health is ok");
        return this;
    }

    private void close() {
        System.out.println(" JDBCPool07 connect is closed");

    }

    public static void execute(Consumer<JDBCPool07> jdbcPool07Consumer) {
        JDBCPool07 jdbcPool07 =  new JDBCPool07();
        try {
            jdbcPool07Consumer.accept(jdbcPool07);
        } catch (Exception e) {
            System.out.println(" " + e);
        } finally {
            jdbcPool07.close();
        }
    }
}

public class ExecutePattern07 {

    public static void main(String[] args) {
        /**
         * We have JDBCPool
         * getconnection
         * close the connection
         */

        JDBCPool07.execute(e->e.checkHealth().getCon());


    }
}
