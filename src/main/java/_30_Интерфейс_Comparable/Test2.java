package _30_Интерфейс_Comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  интерфейс Comparable используется для сравнения объектов, используя естественный порядок.
 *  чтобы его implements нужно перезаписать метод
 *      @Override
 *      public int compareTo(Car o) {
 */

public class Test2 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("bmw", "blue", 1000));
        carList.add(new Car("bmw", "pink", 800));
        carList.add(new Car("bmw", "red", 900));
        System.out.println(carList);
        Collections.sort(carList);
        System.out.println();
        System.out.println("вариант сортировки: " + carList);

    }
}
