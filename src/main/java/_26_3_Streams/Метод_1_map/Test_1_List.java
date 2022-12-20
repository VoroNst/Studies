package _26_3_Streams.Метод_1_map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test_1_List {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Privet");
        stringList.add("Poka");
        stringList.add("Da");
        stringList.add("Net");

        // wordLength1(stringList);
        // wordLength2(stringList);
        System.out.println("stringList " + stringList);

        wordLength3(stringList);
        System.out.println("integerList1 " + wordLength3(stringList));
        List<Integer> integerList2 = wordLength3(stringList);
        System.out.println("integerList2 " + integerList2);
    }

    static void wordLength1(List<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, String.valueOf(stringList.get(i).length()));
        }
    }

    static void wordLength2(List<String> stringList) {
        int i = 0;
        for (String s : stringList) {
            stringList.set(i++, String.valueOf(s.length()));
        }
    }

    static List<Integer> wordLength3(List<String> stringList) {
        List<Integer> integerList1 = stringList.stream().map(el -> el.length()).collect(Collectors.toList());
        return integerList1;
    }
}

