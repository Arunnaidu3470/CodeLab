import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc= new Scanner (System.in);
       int n,s=0;
       n=sc.nextInt();
       while(n>0){
       		int r = n%10;
            s=(s*10)+r;
            n=n/10;
       }
       while(s>0){
         	System.out.print(s%10+" ");
       		s=s/10;
       }
       
	}
}