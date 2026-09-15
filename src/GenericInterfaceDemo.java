interface Calculator1<T> {
    T add(T a, T b);
}

class IntCalc implements Calculator1<Integer> {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}

class DoubleCalc implements Calculator1<Double> {
    public Double add(Double a, Double b) {
        return a + b;
    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        IntCalc i = new IntCalc();
        System.out.println("Integer sum: " + i.add(10, 20));

        DoubleCalc d = new DoubleCalc();
        System.out.println("Double sum: " + d.add(3.5, 4.5));
    }
}