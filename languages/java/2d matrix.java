import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       int x;
       for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
           x=sc.nextInt();
           System.out.print(x+" ");
         }
         System.out.println();
       }
	}
}