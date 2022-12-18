package _1_lambda.sorting._1;

import _0_initialData.Car;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("bmw", "blue", 3500));
        carArrayList.add(new Car("bmw", "red", 3000));
        carArrayList.add(new Car("bmw", "black", 2500));

        sort(carArrayList, "black");
    }

    static void sort(ArrayList<Car> carArrayList, String a) {
        for (Car c : carArrayList) {
            if (c.getColor() == a) {
                System.out.println(c);
            }
        }
    }


}


