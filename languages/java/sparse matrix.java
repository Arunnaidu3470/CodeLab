import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt()*m;
       int zero=0,x;
       for(int i=0;i<n;i++){
         x=sc.nextInt();
           if(x==0)
             zero++;
       }
       if(zero>n/2)
         System.out.print("The matrix is a sparse matrix");
       else
         System.out.print("The matrix is not a sparse matrix");
	}
}