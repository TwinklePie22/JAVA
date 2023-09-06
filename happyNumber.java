package Lab;
import java.util.Scanner;

public class HappyNumberChecker {

    // Nested interface to define a function to calculate the sum of squares of digits
    interface SumOfSquares {
        int calculate(int num);
    }

    // Nested interface to define a function to check if a number is happy
    interface HappyChecker {
        boolean isHappy(int num, SumOfSquares sumOfSquares);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive non-zero number: ");
        int number = scanner.nextInt();

        // Check if the number is happy
        boolean isHappy = isHappyNumber(number, new HappyChecker() {
            @Override
            public boolean isHappy(int num, SumOfSquares sumOfSquares) {
                int slow = num;
                int fast = num;
                do {
                    slow = sumOfSquares.calculate(slow);
                    fast = sumOfSquares.calculate(fast);
                    fast = sumOfSquares.calculate(fast);
                } while (slow != fast);

                return slow == 1;
            }
        });

        if (isHappy) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    // Method to check if a number is a happy number
    public static boolean isHappyNumber(int num, HappyChecker checker) {
        return checker.isHappy(num, new SumOfSquares() {
            @Override
            public int calculate(int num) {
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit * digit;
                    num /= 10;
                }
                return sum;
            }
        });
    }
}
