package _1_lambda.sorting._2;

import _0_initialData.Car;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("bmw", "blue", 3500));
        carArrayList.add(new Car("bmw", "red", 3500));
        carArrayList.add(new Car("bmw", "black", 3500));

        CarInfo carInfo = new CarInfo();
        carInfo.info(carArrayList, new SortCar());
    }
}

interface CheckCar {
    boolean check(Car c);
}

class SortCar implements CheckCar {
    @Override
    public boolean check(Car c) {
        return c.getModel() == "bmw";
    }
}

class CarInfo {
    void info(ArrayList<Car> carArrayList, CheckCar cc) {
        for (Car c : carArrayList) {
            if (cc.check(c)) {
                System.out.println(c);
            }
        }
    }
}
