import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int i;
       int s=sc.nextInt();
       int n=s+1;
       String[] a=new String[n];
       for(i=0;i<n;i++){
         a[i]=sc.nextLine();
         }
       for(i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
           if(a[i].compareTo(a[j])>0){
             String temp=a[i];
             a[i]=a[j];
             a[j]=temp;
             }
            }
          }
       for(i=0;i<n;i++){
         System.out.print(a[i]+" ");
         }
	}
}