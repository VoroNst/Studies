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

        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, String.valueOf(stringList.get(i).length()));
        }


        int i = 0;
        for (String s : stringList) {

            stringList.set(i++, String.valueOf(s.length()));

        }

        System.out.println(stringList);
    }
}
