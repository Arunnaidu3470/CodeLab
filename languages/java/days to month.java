import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       System.out.println(a+" days");
       int b=a/30;
       int c=(a-b*30)%30;
       System.out.println("Month="+b);
       System.out.println("Days="+c);
       
	}
}