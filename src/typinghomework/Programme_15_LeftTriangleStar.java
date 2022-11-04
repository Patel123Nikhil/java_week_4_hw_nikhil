package typinghomework;
/* Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */

import java.util.Scanner;

public class Programme_15_LeftTriangleStar {

    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number of raw : ");
        int a = scanner.nextInt();
        leftTriangle(a);
        //closing the scanner object
        scanner.close();
    }
}
