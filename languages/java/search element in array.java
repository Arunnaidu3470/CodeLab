import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int i;
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(i=0;i<n;i++){
         arr[i]=sc.nextInt();
         }
       int num=sc.nextInt();
       for(i=0;i<n;i++){
       if(num==arr[i]){
         i=i+1;
         System.out.println(num+" is present at index "+i);
         break;
         }
         }
       if(i==n){
         System.out.println(num+" is not present in the array ");
     }
   }
}