import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
Scanner input= new Scanner(System.in);
       int x1=input.nextInt();
       int y1=input.nextInt();
         int x2=input.nextInt();
         int y2=input.nextInt();
double d;
     d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

       System.out.printf("%.2f",d);
   
     }
}