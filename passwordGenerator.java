package Lab;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter the room number: ");
        int roomNumber = sc.nextInt();

        System.out.print("Enter the phone number: ");
        long phoneNumber = sc.nextLong();

        int roomDigitSum = calculateDigitSum(roomNumber);
        int nameLength = name.length();
       
        String password = name.charAt(2)+"$" + String.valueOf(phoneNumber % 10) + roomDigitSum + "#"+ name.charAt(nameLength - 1);
        System.out.println("Generated Password: " + password);
    }

    static int calculateDigitSum(int number) {
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
