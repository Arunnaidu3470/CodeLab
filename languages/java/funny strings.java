import java.io.*;
import java.util.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       sc.nextLine();
       tests:
       for(int i=0;i<T;i++){
         String s=sc.nextLine();
         for(int j=1;j<(s.length()/2)+1;j++){
           int left=Math.abs(s.charAt(j)-s.charAt(j-1));
           int right=Math.abs(s.charAt(s.length()-j-1)-s.charAt(s.length()-j));
           if(left!=right){
             System.out.println("Not Funny");
             continue tests;
           }
           }
         System.out.println("Funny");
         }
     }
}