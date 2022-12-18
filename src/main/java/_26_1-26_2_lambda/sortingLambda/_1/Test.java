package _1_lambda.sortingLambda._1;

import _0_initialData.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("bmw", "blue", 3500));
        carArrayList.add(new Car("bmw", "red", 3000));
        carArrayList.add(new Car("bmw", "black", 2500));

        InfoCar infoCar = new InfoCar();


             infoCar.info(carArrayList, (Car c) -> {return c.getCost()==2500;});


        }
    }
interface CheckCar {
    boolean check(Car c);
}

class InfoCar {
    void info(ArrayList<Car> carArrayList, CheckCar cc){
        for (Car c: carArrayList){
            if(cc.check(c)){
                System.out.println(c);
            }
        }
    }

}