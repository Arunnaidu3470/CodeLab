import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc =new Scanner(System.in);
       String s;
       int flag=0;
       s=sc.nextLine();
       if(Integer.parseInt(s.substring(0,1))==0){
       		System.out.println("no");
       }
       else
       {
         	int n=Integer.parseInt(s);
       		while(n>0){
            	if(n%10==0){
                	flag=1;
                  	break;
                }
              	n=n/10;
            }
         	if(flag==1){
            	System.out.println("yes");
            }
         	else{
            	System.out.println("no");
            }
       }
	}
}