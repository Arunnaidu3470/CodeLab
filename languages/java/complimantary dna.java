import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
     String dna=sc.nextLine();
     for(int i=0;i<dna.length();i++){
       if(dna.charAt(i)=='A'){
       System.out.print("T");
       }
     else if(dna.charAt(i)=='T'){
       System.out.print("A");
       }
     else if(dna.charAt(i)=='C'){
       System.out.print("G");
       }
     else if(dna.charAt(i)=='G'){
       System.out.print("C");
       }
	}
   }
}