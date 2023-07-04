package jug.istanbul.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reverse {

    public static List<Character> tekrarEdenKarakterleriBul(String metin) {
        List<Character> tekrarEdenler = new ArrayList<>();
        Map<Character, Integer> karakterSayilari = new HashMap<>();

        for (char karakter : metin.toCharArray()) {
            if (karakterSayilari.containsKey(karakter)) {
                karakterSayilari.put(karakter, karakterSayilari.get(karakter) + 1);
            } else {
                karakterSayilari.put(karakter, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : karakterSayilari.entrySet()) {
            if (entry.getValue() > 1) {
                tekrarEdenler.add(entry.getKey());
            }
        }

        return tekrarEdenler;
    }

    public static void main(String[] args) {
        List<Character> tekrarEdenler = tekrarEdenKarakterleriBul("merhaba");
        System.out.println(tekrarEdenler); // ['a']

        tekrarEdenler = tekrarEdenKarakterleriBul("kodlama");
        System.out.println(tekrarEdenler); // ['a']

        tekrarEdenler = tekrarEdenKarakterleriBul("abcdefg");
        System.out.println(tekrarEdenler); // []

        tekrarEdenler = tekrarEdenKarakterleriBul("sinan canan");
        System.out.println(tekrarEdenler); // []
    }
}

