import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       float l=sc.nextFloat();
       float b=sc.nextFloat();
       System.out.print("The area of the room is "+String.format("%.2f",(l*b))+" square feet");
	}
}