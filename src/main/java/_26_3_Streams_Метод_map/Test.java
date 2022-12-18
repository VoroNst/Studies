package _26_3_Streams_Метод_map;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Privet");
        stringList.add("Poka");
        stringList.add("Da");
        stringList.add("Net");

        // wordLength1(stringList);

        wordLength2(stringList);
    }

    static void wordLength1(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.print(stringList.get(i) + " ");
            stringList.set(i, String.valueOf(stringList.get(i).length()));
            System.out.print(stringList.get(i) + " ");
        }
        System.out.println("\n" + stringList);
    }

    static void wordLength2(List<String> stringList) {
        int i = 0;
        for (String s : stringList) {
            System.out.print(s + " ");
            stringList.set(i++, String.valueOf(s.length()));
        }
        System.out.println("\n" + stringList);
    }
}

