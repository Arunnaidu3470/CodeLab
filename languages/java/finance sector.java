import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s= new Scanner (System.in);
       int P=s.nextInt();
       int i=s.nextInt();
       int t=s.nextInt();
       //i=i/100;
       //if(
       int I= (P*i*t)/100;
       //String I1=String.format("%.2f",I);
       int A=P+I;
       //String A1=String.format("%.2f",A);
       System.out.println("Interest= "+I);
         System.out.println("Amount= "+A);
	}
}