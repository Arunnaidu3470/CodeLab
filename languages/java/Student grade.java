import java.io.*;
import java.util.Scanner;
class Student{
  	Scanner sc=new Scanner(System.in);
	int mark[]=new int[5];
  	public void getMarks(){
    	for(int i=0;i<5;i++){
        	mark[i]=sc.nextInt();
        }
    }
  	public void studentGrade(){
    	int avg=0;
      	for(int i=0;i<5;i++){
        	avg=avg+mark[i];
        }
      	avg/=5;
      	if(avg>=90){
        	System.out.println("A");
        }
      else if(avg>=80){
      		System.out.println("B");
      }
      else if(avg>=70){
      		System.out.println("C");
      }
      else if(avg>=60){
      		System.out.println("D");
      }
      else{
      		System.out.println("F");
      }
    }
}
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
		Student obj= new Student();
       	obj.getMarks();
       	obj.studentGrade();
	}
}