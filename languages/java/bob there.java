import java.io.*;
import java.util.Scanner;
public class TestClass {
   static boolean bobThere(String str){
       int n=str.length()-1;
       //if(n>2){
         for(int i=0;i<n;i++){
           if(i+2<=n){
             if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
               n=1;
               break;
             }
           }
         }
       //}
       //else
         //n=0;
       return (n==1);
   }
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       String str=sc.next();  
       boolean output=bobThere(str);
       System.out.print(output);
     }
}