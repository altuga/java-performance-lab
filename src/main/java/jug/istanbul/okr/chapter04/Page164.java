package jug.istanbul.okr.chapter04;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Page164 {

    public static void main(String[] args) {
        calculatePeriod();
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

    public static void calculatePeriod(){
        var date = LocalDate.of(2022, 5, 25);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);
        System.out.println(date.plus(period)); // 2022–05–26
        System.out.println(date.plus(days)); // Unsupported unit: Seconds
    }
}
