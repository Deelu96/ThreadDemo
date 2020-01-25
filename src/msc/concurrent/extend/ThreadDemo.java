package msc.concurrent.extend;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("T1");
        t1.setDaemon(true);
//        t1.setPriority(10);
//        System.out.println(t1.getName() + " : " + t1.getState());
        t1.start();
        try {
            //put all the other to WAIT sate
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(t1.getName() + " : " + t1.getState());

        Thread t2 = new MyThread("T2");
//        t2.setDaemon(true);
//        t2.setPriority(1);
//        System.out.println(t2.getName() + " : " + t2.getState());
        t2.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
//            System.out.println(Thread.currentThread().getName() + " : " + i + " Priority : " + Thread.currentThread().getPriority());
//            System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getState());
           /* if (i == 5) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
            }*/
//            System.out.println(t1.getName() + " : " + t1.getState());
//            System.out.println(t2.getName() + " : " + t2.getState());
        }
    }
}
