import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
 Scanner input=new Scanner(System.in);		
	int a= input.nextInt();
     int b=input.nextInt();
int x=a;
       int y=b;
       while(y!=0)
       {
        int t=y;
         y=x%y;
         x=t;
       }
       int hcf=x;
       int lcm=(a*b)/hcf;
       System.out.println(""+hcf);
       System.out.println(""+lcm);
     }
}