class Std2  {
    int id;
    String name;

    Std2 () {
        this(0, "Savs");
    }

    Std2 (int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Std2  s1 = new Std2 ();
        s1.display();

        Std2  s2 = new Std2 (101, "Savs");
        s2.display();
    }
}