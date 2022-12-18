package _30_Интерфейс_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Test1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Roma");
        stringList.add("Masha");
        stringList.add("Sasha");

        System.out.println(stringList);

        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
