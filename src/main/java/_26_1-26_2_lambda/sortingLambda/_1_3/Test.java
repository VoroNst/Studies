package _1_lambda.sortingLambda._1_3;

import _0_initialData.Car;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(new Car("bmw", "red", 1000));
        carArrayList.add(new Car("bmw", "blue", 800));
        carArrayList.add(new Car("bmw", "pink", 900));


        CarInfo carInfo = new CarInfo();
        carInfo.info(carArrayList, (Car c) -> c.getColor()=="pink");
    }
}
interface CarCheck{
    boolean check(Car r);
}

class CarInfo{
    void info(ArrayList <Car> ar, CarCheck cc){
        for(Car c: ar){
            if(cc.check(c)){
                System.out.println(c);
            }
        }
    }
}