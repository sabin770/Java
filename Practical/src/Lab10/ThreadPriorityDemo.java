// Question 5: Write a Java program to demonstrate thread priorities.

class MyThread3 extends Thread {
    MyThread3(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (Priority: " + getPriority() + "): " + i);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Thread 1");
        MyThread3 t2 = new MyThread3("Thread 2");
        MyThread3 t3 = new MyThread3("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        t1.start();
        t2.start();
        t3.start();
    }
}