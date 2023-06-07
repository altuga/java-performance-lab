package jug.istanbul.lambda;

import java.util.List;

public class Staff {

    public static int calculateTotal(List<Integer> values) {
        var result = 0;
        for (var e : values) {
            result += e;
        }
        return result;
    }

    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(calculateTotal(numbers));
    }
}
