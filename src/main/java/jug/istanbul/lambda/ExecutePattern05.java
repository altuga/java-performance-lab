package jug.istanbul.lambda;


import java.util.function.Consumer;

class JDBCResource {

    private JDBCResource() {
        System.out.println("JDBCResource is created");
    }

    public JDBCResource getConnection() {
        System.out.println("Connection is created");
        return this;
    }

    private void close() {
        System.out.println("Connection is closed");
    }

    public static void execute(Consumer<JDBCResource> jdbcResourceConsumer) {
        JDBCResource resource = new JDBCResource() ;
        try{
            jdbcResourceConsumer.accept(resource);

        } catch(Exception ex) {
            System.out.println();
        } finally{
            resource.close();
        }

    }

}
public class ExecutePattern05 {

    public static void main(String[] args) {

        JDBCResource.execute(jdbcResource -> jdbcResource.getConnection());




    }
}
