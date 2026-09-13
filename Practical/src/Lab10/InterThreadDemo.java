// Question 8: Write a Java program demonstrating inter-thread communication using wait(), notify(), and notifyAll().

class Data {
    int value;
    boolean available = false;

    synchronized void produce(int v) {
        try {
            while (available) wait();
        } catch (InterruptedException e) {}
        value = v;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() {
        try {
            while (!available) wait();
        } catch (InterruptedException e) {}
        System.out.println("Consumed: " + value);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Data d;
    Producer(Data d) { this.d = d; }

    public void run() {
        for (int i = 1; i <= 5; i++) d.produce(i);
    }
}

class Consumer extends Thread {
    Data d;
    Consumer(Data d) { this.d = d; }

    public void run() {
        for (int i = 1; i <= 5; i++) d.consume();
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
        Data d = new Data();
        new Producer(d).start();
        new Consumer(d).start();
    }
}