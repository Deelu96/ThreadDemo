package msc.concurrent.implement;

public class RunnableThread implements Runnable {

   /* public RunnableThread(String name) {
        Thread thread = new Thread(this, name);
        thread.start();
    }*/

    @Override
    public void run() {
        for (int i = 65; i <=90 ; i++) {
            System.out.println("Print : "+((char)i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
