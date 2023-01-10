package jug.istanbul.okr.chapter04;

public class Page164 {

    public static void main(String[] args) {
        System.out.println("abc  ".strip());
        System.out.println("\t a b c\n");
        System.out.println("\t a b c\n".strip());
        var block = """
             xxxxxxx       
                a
                b 
             xxxxxxx   
                """;
        System.out.println( block );

    }
}
