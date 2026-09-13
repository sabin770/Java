class VarargsDemo {
    void displayNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    int sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

public class VarargsExample {
    public static void main(String[] args) {
        VarargsDemo obj = new VarargsDemo();

        obj.displayNumbers(1, 2, 3);
        obj.displayNumbers(10, 20, 30, 40);
        obj.displayNumbers(5);

        System.out.println("Sum 1: " + obj.sumNumbers(1, 2, 3));
        System.out.println("Sum 2: " + obj.sumNumbers(10, 20, 30, 40));
    }
}