package msc.concurrent;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Thread_One");
        t1.start();

        Thread t2 = new MyThread("Thread_Two");
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i + " : Main");
        }
    }
}
