package JAVA_INTERNAL;

public class happyNumber {

        // Outer interface for happy number calculation
        public interface HappyNumberHandler {
            int calculate(int n);

            // Inner interface for other calculation (e.g., sum of digits)
            interface DigitSumHandler {
                int calculate(int n);
            }
        }

        public static void main(String[] args) {
            HappyNumberHandler handler = new HappyNumberHandler() {
                @Override
                public int calculate(int n) {
                    int sum = 0;
                    while (n > 0) {
                        int digit = n % 10;
                        sum += digit * digit;
                        n /= 10;
                    }
                    return sum;
                }
            };

            int number = 19;
            if (isHappy(number, handler)) {
                System.out.println(number + " is a happy number.");
            } else {
                System.out.println(number + " is not a happy number.");
            }
        }

        // Check if a number is a happy number using the outer interface
        private static boolean isHappy(int n, HappyNumberHandler handler) {
            int slow = n;
            int fast = n;

            do {
                slow = handler.calculate(slow);
                fast = handler.calculate(handler.calculate(fast));
            } while (slow != fast);

            return slow == 1;
        }
    }

