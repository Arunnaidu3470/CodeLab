import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int a,b,c;
       a=s.nextInt();
       b=s.nextInt();
       c=s.nextInt();
       if((a+b+c)==180)
         System.out.println("YES");
       else
         System.out.println("NO");
	}
}