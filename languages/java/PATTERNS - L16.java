import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
       int summation = 0;
       int i,j;
       int k=n;
    
       for(i=1;i<=n;i++)
       {
         int temp = i;
         System.out.print(i+" ");
       for(j=k-1;j>n-i;j--)
       {
        System.out.print((temp+j+" "));
         temp += j;
          
         
       }
         System.out.println();
       } 
	}
}