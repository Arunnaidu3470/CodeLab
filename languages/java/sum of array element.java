import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
	 Scanner sc = new Scanner(System.in);
     int a[]= new int[10];
     int n,i,s=0;
     n = sc.nextInt();
     for (i = 0 ; i < n ; i++)
     {
       a[i] = sc.nextInt();
     }
       for( i = 0;  i < n ;i++)
       {
         s += a[i];
       }
       System.out.println(s);
       
	}
}