import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       for(int i=0;i<a+1;i++){
         for(int j=0;j<i;j++){
           if(j%2==0){
             System.out.print("1");
             }
           else
             {    
             System.out.print("0");
             }
           }
         System.out.println();
         }  
	}
}