public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            String str = "abc";

            int num = Integer.parseInt(str);
            System.out.println(arr[5]);
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error");
        } catch (Exception e) {
            System.out.println("General Error");
        }

        System.out.println("Program continues...");
    }
}