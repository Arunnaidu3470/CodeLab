import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
Scanner input= new Scanner(System.in);
     double x= input.nextDouble();
       double y =input.nextDouble();
       double z;
       z=x*.10+y*0.25;
       String p=String.format("%.2f",z);
       System.out.println("Refund for Bottles="+p);
	}
}