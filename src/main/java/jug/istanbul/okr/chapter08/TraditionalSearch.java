package jug.istanbul.okr.chapter08;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        Animal a1 = new Animal("rabbit", true, false);
        boolean bol = a1.canHop();

        print(animals, a-> a.canHop());



    }

  private static void print(List<Animal> animals, CheckTrait checker) {
          animals.stream()
              .filter(checker::test)
              .forEach(System.out::println);
      }
}
