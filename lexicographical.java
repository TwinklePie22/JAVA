package Lab;
import java.util.*;

public class Lexiographical {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String []str= new String[5];
		System.out.println("Enter 5 string values :");
		for(int i=0; i<5 ; i++) {
			str[i]=sc.nextLine();
		}
		Arrays.sort(str);
		System.out.println("String in lexographical order :");
		for(String s : str)
		{
			System.out.print(s+"  ");
		}
	}
}
