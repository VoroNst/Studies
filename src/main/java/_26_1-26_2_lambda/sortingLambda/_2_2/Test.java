package _1_lambda.sortingLambda._2_2;

interface I {
    int abc(String s);
}


public class Test {
    static void qwe(I i) {
        System.out.println(i.abc("goodbye"));
    }

    public static void main(String[] args) {
        qwe( s -> s.length());
    }
}
