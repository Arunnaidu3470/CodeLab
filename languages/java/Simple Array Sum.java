import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		  Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();        
          int[] array = new int[10];
      int sum = 0;
      for (int i=0; i<n; i++)
      {
    	  array[i] = sc.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println(sum);
   }
}
	
