import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       String octal=sc.nextLine();
       int decimal;
       String hexadecimal;
       decimal=Integer.parseInt(octal,8);
       hexadecimal=Integer.toHexString(decimal);
       System.out.println(hexadecimal);
		
	}
}