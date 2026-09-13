// Question 2: Create a Rectangle class with methods to calculate area and perimeter.

class Rct1 extends Shape1 {
    double length;
    double width;

    Rct1(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    void displayRct1() {
        super.display();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}