// Question 2: Write a Java program to demonstrate method overriding.

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        Dog1 d = new Dog1();
        Cat c = new Cat();

        System.out.println("Animal: ");
        a.sound();

        System.out.println("Dog: ");
        d.sound();

        System.out.println("Cat: ");
        c.sound();
    }
}