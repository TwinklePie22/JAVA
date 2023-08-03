package JAVA_INTERNAL;
import java.util.Scanner;
public class PossibleNumberOfSquare {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of 'n': ");
            int n = sc.nextInt();

            sc.close();

            int totalSquares = calculateTotalSquares(n);

            System.out.println("Total number of all possible squares in a square matrix of size " + n + "x" + n + ": " + totalSquares);
        }

        private static int calculateTotalSquares(int n) {
            int total = 0;

            for (int i = 1; i <= n; i++) {
                total += i * i;
            }

            return total;
        }
    }


