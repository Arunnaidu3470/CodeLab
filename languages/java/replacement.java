import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
       	String s=sc.next();
        char n=sc.next().charAt(0);
         char c=sc.next().charAt(0);
         char x[]=s.toCharArray();
         x[1]=n;
         x[3]=n;
         char a=c;a--;
         char b=c;b++;
         s=String.valueOf(x);
         s=a+s+b;
         System.out.println(s);
       }
	}
}