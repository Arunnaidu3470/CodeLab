import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args) 
     { 
       Scanner sc = new Scanner(System.in);
       int t,i=0;
       t = sc.nextInt();
       while (i != t)
       {
         int n,j,f=1;
         n = sc.nextInt();
         for( j =1; j<=n ; j++)
         {
           f *= j;
         }
         System.out.println(f);
         i++;
       }
           
	}
}