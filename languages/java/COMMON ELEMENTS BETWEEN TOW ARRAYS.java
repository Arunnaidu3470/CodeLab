import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     int i,j;
     int m=sc.nextInt();
     int n=sc.nextInt();
     int[] arr1=new int[m];
     int[] arr2=new int[n];
     for(i=0;i<m;i++){
       arr1[i]=sc.nextInt();
       }
     for(j=0;j<n;j++){
       arr2[j]=sc.nextInt();
       }
     for(i=0;i<m;i++){
       for(j=0;j<n;j++){
       if(arr1[i]==arr2[j]){
         System.out.println(arr1[i]);
            }
          }
        }	
	}
}