import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int i,n=0;
       String a=sc.nextLine();
       for(i=0;i<a.length()-1;i++){
         if(a.charAt(i)==' '){
           n++;
        }
       }
      System.out.println(n+1);
	}
}