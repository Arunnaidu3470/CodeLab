import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       int a,b;
       a = sc.nextInt();
       b = sc.nextInt();
       a = a ^ b;
       b = a ^ b;
       a = a ^ b;
       System.out.println("After Swap i="+a+" j="+b);
	}
}