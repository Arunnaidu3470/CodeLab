import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n,sum;
       n=sc.nextInt();
       int a[]=new int[n];
       sum=0;
       for(int i=0;i<n;i++)
       {a[i]=sc.nextInt();
        sum+=a[i];}
       System.out.println(sum);
	}
}