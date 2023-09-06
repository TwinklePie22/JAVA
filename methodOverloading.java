package Lab;
import java.util.*;

public class MethodOverload {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public String add(String str1,String str2) {
		return str1+str2;
	}
	public float add(float x, float y) {
		return x+y;
	}
	public static void main(String []args) {
		MethodOverload obj= new MethodOverload();
		int sum1 = obj.add(5,9);
		int sum2 = obj.add(4,8,9);
		float sum3 = obj.add((float)8.9,(float)5.4);
		String concatination = obj.add("Hi its me"," MARIO");
		System.out.println("Sum of 5 and 9  = "+sum1);
		System.out.println("Sum of 4,8 and 9 = "+sum2);
		System.out.println("Sum of 8.9 and 5.4 = "+sum3);
		System.out.println("Conatination of given strings = "+concatination);
	}
}
