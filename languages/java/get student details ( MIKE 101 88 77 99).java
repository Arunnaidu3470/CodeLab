import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) 
     { 
	Scanner sc = new Scanner(System.in)	;
       String Str = sc.nextLine();
       int roll = sc.nextInt();
       int m = sc.nextInt();int e = sc.nextInt();int p = sc.nextInt();
       int tot = m+e+p;
       double per = (double)tot/3;
       System.out.printf("Name=");//Str);
       System.out.println(Str);
       System.out.printf("Roll Number=%d\n",roll);
       System.out.printf("Marks=%d %d %d\n",m,e,p);
       System.out.printf("Total=%d\n",tot);
       System.out.printf("Percentage=");
       System.out.println(per);//(String.format("%.01f",per));
       
	}
}