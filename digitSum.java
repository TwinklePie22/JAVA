package Lab;
import java.util.*;

public class DigitaSum {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a tow-digit number :");
		int num = sc.nextInt();
		
		while (num <10 || num >99) {
			System.out.println("Invalid Number !");
			System.out.print("Enter a tow-digit number : ");
			num = sc.nextInt();
		}
		int digitSum = getDigitSum(num);
		System.out.println("Initial digit sum = "+digitSum);
		
		while(digitSum>=10) {
			digitSum = getDigitSum(digitSum);
		}
		System.out.println("Final digit sum = "+digitSum);
	}
	static int getDigitSum(int num) {
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}
