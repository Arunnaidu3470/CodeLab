import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->=0){
         String s=sc.nextLine();
         System.out.println(new StringBuffer(s).reverse().toString());
       }
	}
}