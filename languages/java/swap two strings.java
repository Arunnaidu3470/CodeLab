import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String s1=sc.next();
       String s2=sc.next();
       String s=s1;
       s1=s2;
       s2=s;
       System.out.println(s1);
       System.out.println(s2);
	}
}