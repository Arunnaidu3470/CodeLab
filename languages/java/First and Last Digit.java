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
       
       int sum = 0;
       int last = n%10;
       while(n/10 != 0)
       {
       n = n/10;
       }
       int first = n;
       sum = first + last;
       System.out.println(sum);
     }
   
	}
}