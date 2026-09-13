// Question 4: Create an abstract Vehicle class and implement it using different vehicle classes.

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }
}