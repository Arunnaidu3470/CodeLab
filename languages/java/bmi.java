import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       float h=sc.nextFloat();
       int w=sc.nextInt();
       double bmi=(w)/(h*h);
       System.out.print(String.format("%.2f",bmi));
	}
}