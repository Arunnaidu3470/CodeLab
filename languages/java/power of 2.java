import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       n = n%31;
       for(int i =0;i <=n; i++)
       {
         System.out.println(i + " " + (int) Math.pow(2,i));
		 
           }
                            
	}
}