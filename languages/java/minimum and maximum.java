import java.io.*;
import java.util.Scanner;
public class TestClass {
  static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args) { 
       
       int t=sc.nextInt();
       while(t-->0){
         //System.out.print(t);
		Sample objname=new Sample();
       objname.getDetails();
       objname.displayDetails();
       }
	}
}
class Sample{
  int n,arr[],cost=0;
  //Scanner sc=new Scanner(System.in);
  public void getDetails(){
    int diff=999;
    n=TestClass.sc.nextInt();
    arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=TestClass.sc.nextInt();
    
    for(int i=0;i<n-1;i++){
      if(diff>arr[i]){
        diff=(arr[i]<arr[i+1])?arr[i]:arr[i+1];
      }
      cost+=diff;
    }
  }
  public void displayDetails(){
    System.out.println(cost);
  }
}