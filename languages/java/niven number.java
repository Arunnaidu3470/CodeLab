import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b,c,d,e;
     b=a%10;
     c=(a/10)%10;
     d=(a/100)%10;
     e=b+c+d;
     if(a%e==0){
       System.out.println("Yes");
       }
     else{
       System.out.println("No");
	}
  }
}