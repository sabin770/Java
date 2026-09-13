// Question 7: Write a Java program to demonstrate synchronization using a synchronized block.

class Counter1 {
    int count = 0;

    void increment() {
        synchronized (this) {
            count++;
        }
    }
}

class MyThread5 extends Thread {
    Counter1 c;

    MyThread5(Counter1 c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 2000; i++) {
            c.increment();
        }
    }
}

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Counter1 c = new Counter1();

        MyThread5 t1 = new MyThread5(c);
        MyThread5 t2 = new MyThread5(c);

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