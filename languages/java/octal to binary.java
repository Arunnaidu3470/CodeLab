import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
       int octnum, rem, quot, i=1, j;
        int binnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
	    octnum = scan.nextInt();
		quot = octnum;
	    while(quot != 0)
        {
            binnum[i++] = quot%2;
            quot = quot/2;
        }
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }
		
	}
}