import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       int s=n1+n2+n3;
       if(s==180)
         System.out.println("YES");
       else
         System.out.println("NO");
		
	}
}