import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       int t =sc.nextInt();
       String str;
       char a,b;
       int flag;
       while(t-->0)
       {
         str=sc.next();
         flag=1;
         a=str.charAt(0);
         b=str.charAt(1);
         if(a==b){
           System.out.println("NO");
           continue;
         }
         for(int i=2;i<str.length();i+=2){
           if(str.charAt(i)!=a){
             flag=0;
             break;
           }
         }
         if (flag==0)
         {
           System.out.println("NO");
           continue;
         }
         for(int i=3;i<str.length();i+=2){
           if(str.charAt(i)!=b){
             flag=0;
             break;}
         }
         if (flag==0)
           System.out.println("NO");
         else
           System.out.println("YES");
       }
	}
}