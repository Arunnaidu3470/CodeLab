import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args) 
     { 
       Scanner sc = new Scanner(System.in);
       int t,i = 0;
       t=sc.nextInt();
         while (i < t)
         {
            int n,l=0,un=0;
            n = sc.nextInt();
            int[] inta = new int[20];
            for (int j=1; j<=n;j++)
             {
               inta[j] = sc.nextInt();
             }
              for (int j=1; j<=n;j++)
               {
                 if((inta[j]%2) == 0)
                 {
                  l++;
                 }
                 else
                 {
                  un++;
                 }
               }
                 if(l>un)
                 {
                  System.out.println("READY FOR BATTLE");
                 }
                 else
                 {
                  System.out.println("NOT READY");
                 }
                i++;
         }
     }
}