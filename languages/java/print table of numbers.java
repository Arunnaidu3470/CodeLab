import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int i;
       int a=sc.nextInt();
       for(i=1;i<11;i++){
         System.out.print(i);
         System.out.print(" * ");
         System.out.print(a);
         System.out.print(" = ");
         System.out.println(i*a);
         }
 	}
}