package Lab;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter the phone number: ");
        long phoneNumber = scanner.nextLong();

        int roomDigitSum = calculateDigitSum(roomNumber);
        int nameLength = name.length();
        char roomDigitChar = (char) ('0' + roomDigitSum);

        String password = name.charAt(2)+"$" + String.valueOf(phoneNumber % 10) + roomDigitChar + "#"+ name.charAt(nameLength - 1);
        System.out.println("Generated Password: " + password);
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum >= 10) {
            return calculateDigitSum(sum);
        }
        return sum;
    }
}
