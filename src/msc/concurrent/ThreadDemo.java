package msc.concurrent;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("Thread_One");
        System.out.println(t1.getName() + " : " + t1.getState());
        t1.start();
        System.out.println(t1.getName() + " : " + t1.getState());

        Thread t2 = new MyThread("Thread_Two");
        System.out.println(t2.getName() + " : " + t2.getState());
        t2.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i + " : Main");
            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
            if (i == 5) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
            }
            System.out.println(t1.getName() + " : " + t1.getState());
            System.out.println(t2.getName() + " : " + t2.getState());
        }
    }
}
