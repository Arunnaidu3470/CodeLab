import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       long b1=sc.nextLong();
       long b2=sc.nextLong();
       long rem=0; int i=0;
       long s[]=new long[20];
       while(b1!=0||b2!=0){
         s[i++]=((b1%10 + b2%10+rem)%2);
         rem=((b1%10 + b2%10+rem)/2);
         b1=b1/10;
         b2/=10;
       }
       if(rem==1)
         s[i]=rem;
       while(i>=0)
         System.out.print(s[i--]);
     
	}
}