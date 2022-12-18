package Task._11_Collections;

import _0_initialData.HeavyBox;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.
 * а) Создать динамический массив, содержащий объекты класса HeavyBox.
 * б) Распечатать его содержимое используя for each.
 * в) Изменить вес первого ящика на 1.
 * г) Удалить последний ящик.
 * д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * е) Удалить все ящики.
 */
public class Test_1 {
    public static void main(String[] args) {

        List<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(23.81));
        boxList.add(new HeavyBox(22.69));
        boxList.add(new HeavyBox(23.82));
        boxList.add(new HeavyBox(15.34));


        printArrayList(boxList);


//        set(boxList, 0, 22.00);
//        printArrayList(boxList);
//
//
//        delete(boxList, boxList.size() - 1);
//        printArrayList(boxList);
        HeavyBox[] arr = new HeavyBox[boxList.size()];

//        method1(boxList, arr);
//        printArray(arr);

        arr = method2(boxList, arr);
        printArray(arr);


    }

    static void printArrayList(List<HeavyBox> boxList) {
        for (HeavyBox h : boxList) {
            System.out.println(h);

        }
        System.out.println();
    }

    static void set(List<HeavyBox> boxList, int a, double b) {
        boxList.set(a, new HeavyBox(b));
        System.out.println();
    }

    static void delete(List<HeavyBox> boxList, int a) {
        boxList.remove(a);
        System.out.println();
    }

    static void method1(List<HeavyBox> boxList, HeavyBox[] arr) {
        arr = boxList.toArray(arr);
        System.out.println("1-й способ ");
        //for (int i = 0; i<arr.size();i++){

    }

    static HeavyBox[] method2(List<HeavyBox> boxList, HeavyBox[] arr1) {
        System.out.println("2-й способ ");

        for (HeavyBox hbar : arr1) {
            for (HeavyBox hbl : boxList) {
                hbar = hbl;
            }
            System.out.println(hbar);

        }

        return arr1;
    }

    static void printArray(HeavyBox[] arr) {
        for (HeavyBox hb : arr) {
            System.out.println(hb);
        }
        System.out.println();
    }
}
