package _26_3_Streams.Многопоточность_8_multithreading.Runnable_способ_2;

public class Test implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test());
        thread.start();

            for (int i = 200; i >0; i--) {
                System.out.println(i);
            }
    }
}

