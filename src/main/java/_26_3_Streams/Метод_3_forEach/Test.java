package _26_3_Streams.Метод_3_forEach;

import _0_initialData.Array;
import _0_initialData.Student;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Array arrays = new Array();
        int[] array = arrays.array;

// 1
//        Arrays.stream(array).forEach(el -> {el = el * 2; System.out.println(el);});
//        Arrays.stream(array).forEach(System.out::println);

//2 referens (ссылка на метод)
//        Arrays.stream(array).forEach(el ->Utils.add(el));
//        Arrays.stream(array).forEach(Utils::add);

//3 Создание Stream без массива и колекций
        Stream<Integer>  studentStream = Stream.of(1,2,3,4,5);
        studentStream.forEach(System.out::print);
    }
}

class Utils {
    public static void add(int a) {
        a = a + 5;
        System.out.println("Element: " + a);
    }
}