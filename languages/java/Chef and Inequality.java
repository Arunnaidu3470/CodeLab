import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t>0)
       {
       t--;
         int a,b,c,d,x,y;
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         d = sc.nextInt();
         int count = 0;
         for(int i=a;i<=b;i++)
         {
         if(i>d)
           break;
           if(i<c)
             count+=d-c+1;
           else 
             count+=d-i;
         }
      
       System.out.println(count);
       }
     }
}