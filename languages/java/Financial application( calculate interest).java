import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       double a=in.nextDouble();
       double b=in.nextDouble();
       double f=(a*b/1200);
      
       System.out.printf("%.02f",f);
	}
}