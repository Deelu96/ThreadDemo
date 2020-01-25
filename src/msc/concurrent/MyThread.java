package msc.concurrent;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i + " Priority : " + Thread.currentThread().getPriority());
//            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
            /*try {
                Thread.sleep(100);
//                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
