package _26_3_Streams.Многопоточность_8_multithreading.Runnable;

public class Test {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread1());
        thread1.start();
        System.out.println();
        Thread thread2 = new Thread(new MyThread2());
        thread2.start();
    }
}

class Xo {
    int a = 200;
}

class MyThread1 extends Xo implements Runnable {
    public void run() {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Xo implements Runnable {
    public void run() {
        for (int i = a; i > 0; i--) {
            System.out.println(i);
        }
    }
}