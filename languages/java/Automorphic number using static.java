import java.io.*;
import java.util.Scanner;
class Automorphic{
  	static void calculate(){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s=Integer.toString((n*n));
      String str=Integer.toString(n);
      if(s.endsWith(str)){
      	System.out.println(s);
        System.out.println("Automorphic Number");
      }
      else{
      	System.out.println(s);
        System.out.println("Not an Automorphic Number");
      }
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		Automorphic.calculate();
	}
}