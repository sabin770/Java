abstract class Shape {
    abstract double area();
    abstract double perimeter();

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle1 extends Shape {
    double length, width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle1 r = new Rectangle1(4, 6);

        System.out.println("Circle:");
        c.display();

        System.out.println("\nRectangle:");
        r.display();
    }
}