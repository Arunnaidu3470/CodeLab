import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
        int p,r;
       float t;
       p=sc.nextInt();
       t=sc.nextFloat();
       r=sc.nextInt();
       System.out.println((p*t*r)/100);
       
	}
}