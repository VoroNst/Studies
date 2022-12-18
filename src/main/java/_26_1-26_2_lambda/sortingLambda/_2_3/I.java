package _1_lambda.sortingLambda._2_3;

public interface I {
    int abc();
}

class Sort{
    void check(I i){
        System.out.println("privet "+ i.abc());
    }
}
class Test{
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.check(() -> 18);
    }
}