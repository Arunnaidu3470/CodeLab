import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String a=sc.nextLine();
       String b=sc.nextLine();
       System.out.println("a="+a+" and b="+b);
       a=a+b;
       b=a.substring(0,a.length()-b.length());
       a=a.substring(b.length());  
       System.out.println("a="+a+" and b="+b);
       
     }
}