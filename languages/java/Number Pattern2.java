import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
        int j;
      for(int i = 1; i<=a; i++)
      {
         for(j=0; j<i; j++)
         System.out.print(i+" ");
           System.out.println();
       }
	}
}