import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int n,k,i,u,d;
       while(t-->0){
         n=sc.nextInt();
         int a[]=new int[n];
         for(i=0;i<n;i++)
         a[i]=sc.nextInt();
         k=sc.nextInt();
         u=a[k-1];
         Arrays.sort(a);
         d=Arrays.binarySearch(a,u);
         System.out.println(d+1);
         }
     }
}
         
           
             
               
              
               
               
         
           
             
         
             
         
       
    
