import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.replace(" ","");
       String a="YES";
       for(int i=0;i<s.length();i++){
         char c=s.charAt(i);
         if(c>='a' || c>='z'){
           a="NO";
           break;
         }
     }
  System.out.print(a);
	}
}