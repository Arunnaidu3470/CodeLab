import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
Scanner input=new Scanner(System.in);
double x=input.nextInt();
      double y=x*0.05;
       double s=x+y;
       double z=x*0.18;
double r=x+y+z;
	System.out.printf("meal=%.1f",x);
       System.out.println("\ntax="+y);
       System.out.println("meal tax="+s);
       System.out.printf("tips=%.1f",+z);
       System.out.println("\ntotal cost="+r);
     }
}