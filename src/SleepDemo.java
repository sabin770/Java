class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("Thread: " + i);
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
    }
}