package msc.concurrent.implement;

public class MyThread {
    public static void main(String[] args) {
//        Runnable r3 = new RunnableThread("R3");
        Runnable r3 = new RunnableThread();

        Thread t3 = new Thread(r3, "R3");
        t3.start();
    }
}
