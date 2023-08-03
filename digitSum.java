package JAVA_INTERNAL;
import java.util.Scanner;
public class digitSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a two-digit number: ");
            int number = sc.nextInt();

            // Ensure the input is a two-digit number
            while (number < 10 || number > 99) {
                System.out.println("Invalid input! Please enter a two-digit number.");
                System.out.print("Enter a two-digit number: ");
                number = sc.nextInt();
            }

            int digitSum = getDigitSum(number);
            System.out.println("Initial Digit Sum: " + digitSum);

            // Find the digit sum until it is less than 10
            while (digitSum >= 10) {
                digitSum = getDigitSum(digitSum);
                System.out.println("Current Digit Sum: " + digitSum);
            }

            System.out.println("Final Digit Sum: " + digitSum);

            sc.close();
        }

        // Method to calculate the digit sum of a number
        private static int getDigitSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }
    }


