import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=n;i>=0;--i){
       for(int j=1;j<2*i;j++){
         System.out.print("*");
           }
         System.out.println();
		}
     }
}