import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     double b;
     b=((float)a*16.6)/100;
     System.out.println(String.format("%.03f",b));
		
	}
}