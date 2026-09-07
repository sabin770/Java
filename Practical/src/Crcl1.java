class Crcl1 extends Shape1 {
    double radius;

    Crcl1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void displayCrcl1() {
        super.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }
}