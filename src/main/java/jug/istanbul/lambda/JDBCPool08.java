package jug.istanbul.lambda;

import java.util.function.Consumer;

class JDBCPool10 {
     private JDBCPool10() {
         System.out.println("created");
     }

     public JDBCPool10 getConn() {
         System.out.println("getConn");
         return this;
     }

     public JDBCPool10 isHealthy() {
         System.out.println(" Checking health ... ok");
         return this;
     }

    private void close() {
         System.out.println("Closing. ... the resource");
     }

     public static void run(Consumer<JDBCPool10> consumer) {
         JDBCPool10 jdbcPool10 = new JDBCPool10();
         try {
             consumer.accept(jdbcPool10);
         } catch (Exception ex) {
             System.out.println(" .... Loglandı to beholder " );
         } finally {
             jdbcPool10.close();
         }
     }



}

class Main10 {
    public static void main(String[] args) {
        // System.gc();
       JDBCPool10.run(e->e.isHealthy().getConn());


    }
}
