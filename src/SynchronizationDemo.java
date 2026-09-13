class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyThread4 extends Thread {
    Counter c;

    MyThread4(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        MyThread4 t1 = new MyThread4(c);
        MyThread4 t2 = new MyThread4(c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println("Count: " + c.count);
    }
}