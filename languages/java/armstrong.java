import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=n,r,sum=0;
       while(n>0){
       	 r=n%10;
         sum+=(r*r*r);
         n/=10;
       }
       if(sum==k)
         System.out.print("YES");
       else
         System.out.print("NO");
	}
}