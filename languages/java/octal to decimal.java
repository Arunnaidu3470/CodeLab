import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     String octal;
     octal=sc.nextLine();
     int decimal;
     decimal=Integer.parseInt(octal,8);
     System.out.println(decimal);
	}
}