package _30_Интерфейс_Comparable;

public class Car implements Comparable<Car> {
    private String model;
    private String color;
    private Integer cost;


    public Car(String model, String color, int cost) {
        this.model = model;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Car o) {

/** 1-й вариант написания */

//        if(this.cost == o.cost){
//      return 0;}
//        else if (this.cost<o.cost){
//            return -1;
//        }
//        else return 1;

/** 2-й вариант написания */
//        return this.cost-o.cost ;

/** 3-й вариант написания только int надо заменить на Integer */
        //return this.cost.compareTo(o.cost) ;

/** 4-й вариант написания для String */
        int res = this.model.compareTo(o.model);
        if (res == 0) {
            res = this.color.compareTo(o.color);
        }
        return res;
    }
}
