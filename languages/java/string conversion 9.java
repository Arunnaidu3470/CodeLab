import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] a=new int[n];
       for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
         }
       String[] b=new String[n];
       for(int i=0;i<n;i++){
         b[i]=Integer.toString(a[i]);
         System.out.println(b[i]);
         }
   	}
}