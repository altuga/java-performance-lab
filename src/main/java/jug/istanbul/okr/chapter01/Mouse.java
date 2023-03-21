package jug.istanbul.okr.chapter01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Mouse {
    final static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }

    public static void main(String args[]) throws IOException {
        Mouse mouse = new Mouse();
        mouse.grow(10);


        //region Description
        File file = new File("delete.txt");


        List<String> strings = new ArrayList<>();
        String line;
        //endregion



        try (BufferedReader reader = new BufferedReader(new FileReader(file));){
            strings = reader.lines().filter(l-> !l.isBlank()).filter(l -> l.length() > 3).toList();
        }



        String hello = "hello";

        for (String string : strings) {

        }


    }
}