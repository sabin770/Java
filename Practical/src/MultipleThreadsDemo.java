class MyThread1 extends Thread {
    String name;

    MyThread1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class MultipleThreadsDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Thread 1");
        MyThread1 t2 = new MyThread1("Thread 2");
        MyThread1 t3 = new MyThread1("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}