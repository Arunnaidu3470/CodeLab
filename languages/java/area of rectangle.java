import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int length=sc.nextInt();
     int breadth=sc.nextInt();
     int area;
     area=length*breadth;
     System.out.println("Area="+area);
     }
}
