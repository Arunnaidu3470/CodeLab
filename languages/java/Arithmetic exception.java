import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args) 
     {
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       try
       {
           System.out.println(a/b);
       }
       catch(ArithmeticException e)
       {
         System.out.println(e);
       }
	}
}