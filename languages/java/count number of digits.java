import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		
       int i=0;
       Scanner sc=new Scanner(System.in);
       long l=sc.nextLong();
       while(l>0){
         i++;
         l=l/10;
	}
       System.out.print(i);
    }
}