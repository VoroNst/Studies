package _1_lambda.sortingLambda._1_4;

import _0_initialData.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(new Car("bmw", "red", 1000));
        carArrayList.add(new Car("bmw", "blue", 800));
        carArrayList.add(new Car("bmw", "pink", 900));

        CarInfo carInfo = new CarInfo();
        carInfo.info(carArrayList, s -> s.getColor() == "red");
    }
}

interface CarCheck{
   boolean check(Car c);
}
 class CarInfo{
    void info(ArrayList<Car> carArrayList, CarCheck cc){
        for( Car c : carArrayList){
            if (cc.check(c)){
                System.out.println(c);
            }
        }
    }
}