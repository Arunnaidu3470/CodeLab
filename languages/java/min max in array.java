import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       int[] a = new int[10];
        int n,max,min,i;
       n=sc.nextInt();
       for (i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
       }
       max=a[0];
       min=a[0];
       for(i=1;i<n;i++)
       {
         if(a[i]>max)
         { 
           max=a[i];
         }
           if(a[i]<min)
           {
             min=a[i];
           }
       }
       System.out.println(max);
       System.out.println(min);
	}
}