import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
         int j=1;
         while(j<i)
           System.out.print(j+++" ");
         while(j>0)
           System.out.print(j--+" ");
         System.out.println();
       }
	}
}