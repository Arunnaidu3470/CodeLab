import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
       int d;
       d=a*b/100;
       System.out.println(d-c);
	}
}