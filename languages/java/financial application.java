import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
       double x=input.nextDouble();
       double y=input.nextDouble();
       double k=y/100;
       double g=x*k;
       double z=x+g;
       System.out.printf("Gratuity=%.2f",g);
       System.out.printf("\nTotal=%.2f",z);
      }
}