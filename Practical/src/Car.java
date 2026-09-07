class Car extends Vehicle {
    String model;

    Car(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
        System.out.println("Car constructor called");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Model: " + model);
    }
}