import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t--!=0){
       int n=sc.nextInt();
         if(n%11==0)
           System.out.println(1);
         else
           System.out.println(0);
       }
	}
}