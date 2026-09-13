// Question 3: Write a Java program to demonstrate dynamic method dispatch.

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal1 ref;

        ref = new Animal1();
        ref.sound();

        ref = new Dog1();
        ref.sound();

        ref = new Cat();
        ref.sound();
    }
}