import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       double area;
       double l=sc.nextDouble();
       double w=sc.nextDouble();
        area=(l*w);
       area=area/43560;
       System.out.printf("The area of the field is "+String.format("%.2f",area)+" acres");
	}
}