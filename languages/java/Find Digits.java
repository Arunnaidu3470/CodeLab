import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t!=0)
       {
         t--;
       int n = sc.nextInt();
       int c = n,m,count=0;
       
       while(n!=0)
       { 
       m = n%10;
         	if(m!=0 )
            {
         if(c % m == 0)
           count = count +1;
            }
         n = n/10;
       }
        
         System.out.println(count);
         
       }
	}
}