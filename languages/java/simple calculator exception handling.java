import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		int result;
       Scanner sc  = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       char c = sc.next(".").charAt(0);
       if(c=='-')
         System.out.println((a-b));
       else if (c=='+')
         System.out.println((a+b));
       else if(c=='*')
         System.out.println((a*b));
       else if(c == '/')
         System.out.println((a/b));
       else if (c == '%')
         System.out.println((a%b));
         
	}
}