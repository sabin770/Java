class PassByValue {
    void modifyPrimitive(int num) {
        num = 100;
        System.out.println("Inside method: " + num);
    }

    void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside method: " + arr[0]);
    }

    void modifyObject(Studentttt s) {
        s.name = "Modified";
        System.out.println("Inside method: " + s.name);
    }
}

class Studentttt {
    String name;
    Studentttt(String name) {
        this.name = name;
    }
}

public class PassByValueDemo {
    public static void main(String[] args) {
        PassByValue obj = new PassByValue();

        System.out.println("=== Primitive Type ===");
        int num = 10;
        System.out.println("Before: " + num);
        obj.modifyPrimitive(num);
        System.out.println("After: " + num);

        System.out.println("\n=== Array Reference ===");
        int[] arr = {10, 20, 30};
        System.out.println("Before: " + arr[0]);
        obj.modifyArray(arr);
        System.out.println("After: " + arr[0]);

        System.out.println("\n=== Object Reference ===");
        Studentttt s = new Studentttt("Savs");
        System.out.println("Before: " + s.name);
        obj.modifyObject(s);
        System.out.println("After: " + s.name);
    }
}