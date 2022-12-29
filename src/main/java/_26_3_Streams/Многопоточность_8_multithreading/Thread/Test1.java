package _26_3_Streams.Многопоточность_8_multithreading.Thread;

public class Test1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        System.out.println();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for(int i = 0; i<200; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        for(int i = 201; i>0;i--){
            System.out.println(i);
        }
    }
}
