import java.io.*;
import java.util.Scanner;
public class TestClass {
  	 public int Search(int b){
        int count=0;
       	for(int i=1;i<b;i++){
          	if((i*i)!=b){
                for(int j=i;j<b;j++){
                    if(((j*j)+(i*i))==b){
                        count=1;
                    }
                }
            }
          else{
          		return 1;
          }
        }
        return count;
     }
	 public static void main(String[] args) { 
		TestClass objname=new TestClass();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++){
          a[i]=sc.nextInt();	
          System.out.println(objname.Search(a[i]));
        }
     }
}