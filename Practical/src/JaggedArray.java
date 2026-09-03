public class JaggedArray {
    public static void main(String[] args) {
        // Declaring jagged array
        int[][] jaggedArray = new int[3][];

        // Initializing each row with different sizes
        jaggedArray[0] = new int[2];  // Row 0: 2 columns
        jaggedArray[1] = new int[3];  // Row 1: 3 columns
        jaggedArray[2] = new int[4];  // Row 2: 4 columns

        // Assigning values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;

        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;
        jaggedArray[2][2] = 8;
        jaggedArray[2][3] = 9;

        // Alternative: Direct initialization
        int[][] jagged = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("=== Jagged Array Demo ===");

        // Displaying jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Display with sizes
        System.out.println("\n=== Array Sizes ===");
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Row " + i + " has " + jagged[i].length + " elements");
        }
    }
}