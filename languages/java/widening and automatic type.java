import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       int a;
       Scanner sc = new Scanner (System.in);
       a = sc.nextInt();
       long l = a;
       float f = l;
       System.out.println("Int value "+a);
       System.out.println("Long value "+l);
       System.out.println("Float value "+f);
       }
}