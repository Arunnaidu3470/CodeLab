import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       int t,n;
       t=sc.nextInt();
       while(t>0){
         n=sc.nextInt();
       	 int a[]=new int[n];
         int b[]=new int[n];
         for(int i=0;i<n;i++){
         	a[i]=sc.nextInt();
           	if(a[i]<0){
            	a[i]=-a[i];
            }
         }
         int j=1,found=0;
         b[0]=a[0];
         for(int i=1;i<n;i++){
           	found=0;
         	for(int k=0;k<j;k++){
            	if(a[i]==b[k])
                  found=1;
            }
            if(found!=1){
           		b[j]=a[i];
              	j++;
            }
         }
         System.out.println(j);
         t--;
       }
       
	}
}