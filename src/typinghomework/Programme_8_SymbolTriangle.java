package typinghomework;
/* Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Programme_8_SymbolTriangle {
    public static void symboleTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of raw:");
        symboleTriangle((scanner.nextInt()));
        //closing the scanner object
        scanner.close();
    }

}
