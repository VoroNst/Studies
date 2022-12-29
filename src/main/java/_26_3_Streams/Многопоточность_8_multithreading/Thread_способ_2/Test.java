package _26_3_Streams.Многопоточность_8_multithreading.Thread_способ_2;

public class Test extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<200; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.start();
        for (int i = 200; i>0; i--) {
            System.out.println(i);

        }
    }
}
