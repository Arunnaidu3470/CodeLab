import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Sample.findThePairs();
       
		
	}
}
class Sample{
  static void findThePairs(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    
    int s=sc.nextInt();
    
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==s)
          System.out.println(arr[i]+"+"+arr[j]+"="+s);
      }
    }
  }
}