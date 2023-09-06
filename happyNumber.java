package Lab;
import java.util.Scanner;

public class HappyNumber {

    interface SumOfSquares {
        int calculate(int num);
    }

    interface HappyChecker {
        boolean isHappy(int num, SumOfSquares digitSqaureSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a positive non-zero number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive non-zero number.");
            }
        } while (number <= 0);

        boolean isHappy = isHappyNumber(number, new HappyChecker() {
            @Override
            public boolean isHappy(int num, SumOfSquares digitSqaureSum) {
                int slow = num;
                int fast = num;
                do {
                    slow = digitSqaureSum.calculate(slow);
                    fast = digitSqaureSum.calculate(fast);
                    fast = digitSqaureSum.calculate(fast);
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
