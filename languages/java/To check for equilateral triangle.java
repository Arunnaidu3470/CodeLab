import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double n1=sc.nextDouble();
       double n2=sc.nextDouble();
       double n3=sc.nextDouble();
       if(n1==n2 && n2==n3)
         System.out.print("Yes");
       else
         System.out.print("No");
		
	}
}