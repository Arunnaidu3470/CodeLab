import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int sum=0;
     for(int i=1;i<a;i++){
       if(a%i==0){
         sum+=i;
         }
       }
       if(a==sum){
         System.out.println("Perfect number");
         }
       else{
         System.out.println("Not Perfect number");
         }
	}
}