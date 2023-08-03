package JAVA_INTERNAL;

public class methodOverloadingP8 {

        // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // Method to add two doubles
        public double add(double a, double b) {
            return a + b;
        }

        // Method to concatenate two strings
        public String add(String str1, String str2) {
            return str1 + str2;
        }

        public static void main(String[] args) {
            methodOverloadingP8 example = new methodOverloadingP8();

            // Call the methods with different parameter lists
            int sum1 = example.add(2, 3);
            int sum2 = example.add(1, 2, 3);
            double sum3 = example.add(2.5, 3.7);
            String combinedStr = example.add("Hello, ", "World!");

            System.out.println("Sum of 2 and 3: " + sum1);
            System.out.println("Sum of 1, 2, and 3: " + sum2);
            System.out.println("Sum of 2.5 and 3.7: " + sum3);
            System.out.println("Concatenated string: " + combinedStr);
        }
    }


