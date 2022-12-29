package _26_3_Streams.Многопоточность_8_multithreading.способ_3;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 200; i > 0; i--) {
                System.out.println(i);
            }
        }).start();
    }
}
