import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int a=in.nextInt();
       int t;
       int c[]=new int[a];
       for(int i=0;i<a;i++)
         c[i]=in.nextInt();
       for(int i = 0; i<a; i++)
       {
         for(int j=0; j<a-1; j++)
         {
           if(c[j]>c[j+1])
           {
             t=c[j];
             c[j]=c[j+1];
             c[j+1]=t;
           }
         }
       }
       for(int i=0; i<a; i++)
       {
         System.out.print(c[i]+" ");
       }
	}
}