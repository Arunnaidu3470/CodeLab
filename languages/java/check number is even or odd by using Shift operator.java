import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       if(a%2!=0)
       System.out.println("Odd");
       else
         System.out.println("Even");
	}
}