import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       if(a==0)
       System.out.println("Is equal to zero");
       else if(a<0)
         System.out.println("Negative");
       else
         System.out.println("Positive");
	}
}