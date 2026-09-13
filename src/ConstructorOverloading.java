class Rectanglee {
    double length;
    double width;

    // Constructor with no parameters
    Rectanglee() {
        length = 1;
        width = 1;
    }

    // Constructor with one parameter (square)
    Rectanglee(double side) {
        length = side;
        width = side;
    }

    // Constructor with two parameters
    Rectanglee(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectanglee r1 = new Rectanglee();
        Rectanglee r2 = new Rectanglee(5);
        Rectanglee r3 = new Rectanglee(4, 6);

        r1.display();
        r2.display();
        r3.display();
    }
}