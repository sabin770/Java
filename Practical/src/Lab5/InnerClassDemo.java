// Question 7: Write a Java program using an inner class.

class Outer {
    String outerField = "Outer field";

    class Inner {
        void display() {
            System.out.println("Inner class method");
            System.out.println("Accessing: " + outerField);
        }
    }

    void show() {
        Inner inner = new Inner();
        inner.display();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();

        Outer.Inner innerObj = outer.new Inner();
        innerObj.display();
    }
}