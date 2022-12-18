package _1_lambda.sortingLambda._1_2;

import _0_initialData.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>();
        carArrayList.add(new Car("bmw", "blue", 3500));
        carArrayList.add(new Car("bmw", "red", 3000));
        carArrayList.add(new Car("bmw", "black", 2500));

        CarInfo carInfo = new CarInfo();


            carInfo.info(carArrayList, (Car c) -> c.getColor()=="blue");


    }
}

interface CarCheck{
    boolean check(Car c);
}

class CarInfo{
    void info(ArrayList<Car> carArrayList, CarCheck cc ){
        for ( Car c: carArrayList){
            if(cc.check(c)){
                System.out.println(c);
            }
        }
    }
}