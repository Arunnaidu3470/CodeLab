import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		int[] inta = new int[20]; 
       int s= 0;
       Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
          inta[i]=sc.nextInt();
          s += inta[i];
        }
       System.out.println(s);
	}
}