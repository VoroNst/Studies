package _26_3_Streams.Метод_1_map;

import java.util.Arrays;

public class Test_2_Array {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 5, 6, 12};

        arr = Arrays.stream(arr).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
