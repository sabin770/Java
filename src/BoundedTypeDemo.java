class Calculator2<T extends Number> {
    T num;

    Calculator2(T num) {
        this.num = num;
    }

    double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedTypeDemo {
    public static void main(String[] args) {
        Calculator2<Integer> i = new Calculator2<>(5);
        System.out.println("Square of Integer: " + i.square());

        Calculator2<Double> d = new Calculator2<>(2.5);
        System.out.println("Square of Double: " + d.square());
    }
}