import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner s=new Scanner(System.in);
       int l,b,res;
       l=s.nextInt();
       b=s.nextInt();
       res=2*(l+b);
       System.out.println(res);
	}
}