import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       long sum=0,r;
       while(n>0){
         r=n%10;
         sum+=r;
         n=n/10;
	}
     System.out.println(sum);
     }
}