package JAVA_INTERNAL;

public class ExceptionHandeling {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 0};
        int b;
        try {
            int res = a[0] / a[a.length - 1];
            System.out.println(res);
            try {
                System.out.println(a[8]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception is " + e);
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
    }


    }

