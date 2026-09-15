public class GenericSwapDemo {
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 30, 40};
        System.out.println("Before: " + java.util.Arrays.toString(intArr));
        swap(intArr, 0, 3);
        System.out.println("After: " + java.util.Arrays.toString(intArr));

        String[] strArr = {"Apple", "Banana", "Mango"};
        System.out.println("\nBefore: " + java.util.Arrays.toString(strArr));
        swap(strArr, 0, 2);
        System.out.println("After: " + java.util.Arrays.toString(strArr));
    }
}