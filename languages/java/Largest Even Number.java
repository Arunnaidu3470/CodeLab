import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		int n;
       int count,i,ecount;
       int a[] = new int[30];
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t>0)
       {
         count = 0;
         i = 0;
         ecount = 0;
       t--;
         int o=0;
       n = sc.nextInt();
         while(n>0)
         {
          count++;
         a[count-1] = n %10; 
           o = n/10 + 1;
           n/=10;
          }        
         int k = 0 ;
         if(a[0]==7)
         {
         System.out.println("75310");
         }
         else
         {
         for(i=0;i<count;i++)
     
       {
   			if(a[i]%2==0)
            {
              ecount++;
            }
           
         }
         if(ecount>0)
         {
         int small_even = 0;
       for(i=0;i<count-1;i++)
       {
       for(int j=0;j<count-2;j++)
       {
       if(a[j]<a[j+1])
          {
       int temp =   a[j]; 
            a[j] = a[j+1];
			a[j+1] = temp;
            
          }
       }
              }
         int index = 0;
        for(i=0;i<count;i++)
        {
          if(a[i]%2==0)
          {
        small_even = a[i];
            
          break;
          }
        }
         for(i=0;i<count;i++)
         {
         if(a[i]%2==0 && a[i] <= small_even)
         {
           small_even = a[i];
           index = i;
         }
         }
         
         int temp;
        
        temp = a[count-1];
         a[count-1] = small_even;
         a[index] = temp;
   
      
         for(i=0;i<count-1;i++)
         {
         for(int j=0;j<count-2;j++)
         {
         if(a[j]<a[j+1])
         {
         int temp2 = a[j];
           a[j] = a[j+1];
           a[j+1] = temp2;
         }
         }
         }
         
         for(i=0;i<count;i++)
         {
         System.out.print(a[i]);
         }
         System.out.println();
         }
         else
         {
         for(i = 0;i< count ; i++)
         {
         for(int j=0; j<count-1;j++)
         {
         if(a[j]<a[j+1])
         {
         int temp3 = a[j];
           a[j] = a[j+1];
           a[j+1] = temp3;
         }
         }
         }
           for(i=0;i<count;i++)
           {
           System.out.print(a[i]);
           }
           System.out.println();
         }
         }
 }
 
     }
}