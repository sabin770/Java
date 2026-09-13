class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void display() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
        super.sound();
        sound();
    }

    void sound() {
        System.out.println("Dog barks");
    }
}