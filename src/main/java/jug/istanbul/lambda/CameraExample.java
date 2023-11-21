package jug.istanbul.lambda;


import java.awt.*;
import java.util.function.Function;
import java.util.logging.Filter;
import java.util.stream.Stream;

class Camera {

    Function<Color, Color> filter;

    public Camera(Function<Color, Color>... filters) {
        filter = input -> input;
        //for (Function<Color, Color> filterInner:filters) {
        //   filter = filter.andThen(filterInner);
        // }

        filter = Stream.of(filters).reduce(Function.identity(), Function::andThen);
    }

    public Color snap(Color input) {
        return filter.apply(input);
    }

}

public class CameraExample {

    public static void print(Camera camera) {
        Color color = camera.snap(new Color(125, 125, 125));
        System.out.println(color.toString());
    }

    public static void main(String args[]) {
        print(new Camera());

        print(new Camera( camera -> camera.brighter()));
        print(new Camera( Color::brighter));
        print(new Camera( Color::brighter, Color::darker, Color::darker));
        //print(new Camera());

        Function<Integer, Integer> a  = x -> x * 2;;
        //a = b-> b ;
        //a.identity();
        System.out.println(a.apply(6));


        /**
         *  - Function bir iş yapmalı
         *      -  Örneğin bir security işi yapmalı
         *          - Color gibi bir obje yapılabilir.
         *      -  Daha sonra bunu decore etmelisin
         */

    }

}
