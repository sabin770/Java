//  1
//  2 2
//  3 3 3
//  4 4 4 4
//  5 5 5 5 5
public class loop {
    public static void main(String[] args) {
        int j,i;
            for ( i = 1; i >= 5; i++) {
                for ( j = 1; j >= i; j++) {
                    System.out.print(" " + i);
                }
                System.out.println();
        }
    }
}

//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5
//  public class loop {
//     public static void main(String[] args) {
//         int j,i;
//             for ( i = 1; i <= 5; i++) {
//                 for ( j = 1; j <= i; j++) {
//                     System.out.print(" " + j);
//                 }
//                 System.out.println();
//         }
//     }
// }

//  5 5 5 5 5
//  4 4 4 4
//  3 3 3
//  2 2
//  1
// public class loop {
//     public static void main(String[] args) {
//         int i,j;
//         for (i = 5; i >= 1; i--) {
//             for (j = 1; j <= i; j++) {
//                 System.out.print(" " + i);
//             }
//             System.out.println();
//         }
//     }
// }