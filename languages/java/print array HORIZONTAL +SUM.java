import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       int n,i,s=0 ;
       n = sc.nextInt();
       int[] a = new int[ n ];
       for(i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
         s += a[i];
       }
       for(i=0;i<n;i++)
       {
         System.out.println(a[i]);
       }
       System.out.println("Sum="+s);
     }
}