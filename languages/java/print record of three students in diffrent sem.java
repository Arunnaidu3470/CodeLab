import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Student obj = new Student();
       obj.studentDetails();
       obj.studentDetail();
	}
}
class Student{
  public void studentDetails(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    n=3;
    int j=0;
    while(j++<n){
      int arr[]=new int[9];
      System.out.println("Student "+j+":");
      for(int i=0,s=1;i<9;i++){
        if(i%3==0)
          System.out.println("Sem "+ s++ +":");
        arr[i]=sc.nextInt();
        System.out.println(arr[i]);
      }
    }
  }
  public void studentDetail(){
  }
}