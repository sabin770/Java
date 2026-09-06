interface Drawable {
    void draw();
    void color();
}

class Circle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle1");
    }

    public void color() {
        System.out.println("Coloring Circle1 Red");
    }
}

class Rectangle2 implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void color() {
        System.out.println("Coloring Rectangle Blue");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Rectangle2 r = new Rectangle2();

        c.draw();
        c.color();

        System.out.println();

        r.draw();
        r.color();
    }
}