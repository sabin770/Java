class Std {
    String name;
    int age;

    // Default constructor
    Std() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Std(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Std s1 = new Std();
        s1.display();

        Std s2 = new Std("Savs", 19);
        s2.display();
    }
}