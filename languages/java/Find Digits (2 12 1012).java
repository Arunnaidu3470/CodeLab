import java.io.*;
import java.util.Scanner;
public class TestClass
{
   public static void main(String args[])
   {
     Scanner in= new Scanner(System.in);
       int N,a=0, s;
     int T=in.nextInt();
     while(T>0)
     {
       N=in.nextInt();
       int m=N;
       s=0;
       while(N!=0)
       {
           a=N%10;
         if(a!=0)
         if(m%a==0)
           s++;
           N=N/10;
           
       }
       System.out.println(s);
       T--;
     }
   }
}