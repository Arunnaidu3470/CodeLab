import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args)
     { 
       Scanner in=new Scanner(System.in);
		int a=in.nextInt();
       int i,j,t;
       int[] b=new int[a];
       for(i=0;i<a;i++)
         b[i]=in.nextInt();
       for(i=0;i<a;i++)
       {
         for(j=0;j<a-1;j++)
         {
           if(b[j]>b[j+1])
              {
                t=b[j];
                b[j]=b[j+1];
                b[j+1]=t;
              }
           }
        }
              for(i=0;i<a;i++)
              System.out.println(b[i]);
	}
}