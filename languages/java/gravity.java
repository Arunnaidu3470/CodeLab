import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       int d;
       float vf,vi;
       vi=0;
       Scanner sc=new Scanner(System.in);
       d=sc.nextInt();
       vf=(float)Math.sqrt(vi+(2*9.8*d));
       System.out.println("The object will hit the ground at "+String.format("%.2f",vf)+ " m/s" );
	}
}