class OverloadDemo {
    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(double a) {
        System.out.println("Double: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void display(String str) {
        System.out.println("String: " + str);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.display();
        obj.display(10);
        obj.display(10.5);
        obj.display(5, 15);
        obj.display("Hello");
    }
}