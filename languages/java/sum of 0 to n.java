import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int i=0,sum=0;
       while(i<=a){
         sum+=i;
         i++;
       }
       System.out.println(sum);
	}
}