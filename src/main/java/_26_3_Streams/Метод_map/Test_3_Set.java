package _26_3_Streams.Метод_map;


import java.util.*;
import java.util.stream.Collectors;


public class Test_3_Set {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Privet");
        stringList.add("Poka");
        stringList.add("Da");
        stringList.add("Net");


        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Privet");
        stringSet.add("Poka");
        stringSet.add("Da");
        stringSet.add("Net");

//        System.out.println(stringList);
//        worldLength1(stringList);
//        System.out.println(worldLength1(stringList));

        //System.out.println(stringSet);
        //wordLength2(stringSet);
        //System.out.println(wordLength2(stringSet));

        System.out.println(stringList);
        worldLength3(stringList);
        System.out.println(worldLength3(stringList));
        System.out.println(stringSet);
        worldLength3(stringSet);
        System.out.println(worldLength3(stringSet));


    }

    static Set<Integer> worldLength1(List<String> stringList ){
        Set<Integer> integerSet1 = stringList.stream().map(el -> el.length()).collect(Collectors.toSet());
        return integerSet1;
    }

    static Set<Integer> wordLength2(Set<String> stringSet) {
        Set<Integer> integerSet1 = stringSet.stream().map(el -> el.length()).collect(Collectors.toSet());
        return integerSet1;
    }

    static Collection<Integer> worldLength3(Collection <String> c ){
        Set<Integer> integerSet1 = c.stream().map(el -> el.length()).collect(Collectors.toSet());
        return integerSet1;
    }
}
