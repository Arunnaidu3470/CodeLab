import java.io.*;
import java.util.Scanner;
class Deletearray{
	public void deleteElement(){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a[]=new int[n];
      	for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
      	int c=sc.nextInt();
      	int flag=0;
      	for(int i=0;i<n;i++){
        	if(a[i]==c){
            	flag=1;        	
            }   
        }
      	if(flag==1){
        	for(int i=0;i<n;i++){
            	if(a[i]!=c){	
              		System.out.print(a[i]+" ");
                }	
            }
        }
      	else{
        	System.out.print("Element Not Found");
        }
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		Deletearray obj=new Deletearray();
        obj.deleteElement();
	}
}