package JAVA_INTERNAL;
import java.util.Scanner;
public class PyramidPatternP10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of levels in the pyramid: ");
            int levels = sc.nextInt();
            printPyramid(levels);
            sc.close();
        }
        // Method to print the pyramid pattern
        private static void printPyramid(int levels) {
            for (int i = 1; i <= levels; i++) {
                // Print spaces before the stars
                for (int j = 1; j <= levels - i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                // Move to the next line for the next level
                System.out.println();
            }
        }
    }


