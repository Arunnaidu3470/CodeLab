import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(n!=0){
         int k=n;
         while(k!=0){
           System.out.print("*");
           k--;
	}
         System.out.println();
         n--;
       }
     }
}