package _1_lambda.sortingLambda._1_6;

import _0_initialData.Car;

import java.util.ArrayList;

interface CarCheck {
   boolean check(Car c) ;
}



public class Test {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<Car>();
        carArrayList.add(new Car("bmw", "red", 1000));
        carArrayList.add(new Car("bmw", "blue", 800));
        carArrayList.add(new Car("bmw", "pink", 900));

        sort(carArrayList, a-> a.getCost()==900);
    }

    static void sort(ArrayList<Car> ca, CarCheck cc) {
        for (Car c: ca){
            if(cc.check(c)){
                System.out.println(c);
            }
        }
    }

}