import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int sum=0;
       int arr[][]=new int[n][n];
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
           arr[i][j]=sc.nextInt();
           System.out.print(arr[i][j]+" ");
           if(i==j)
             sum+=arr[i][j];
         }
         System.out.println();
       }
       System.out.print(sum);
	}
}