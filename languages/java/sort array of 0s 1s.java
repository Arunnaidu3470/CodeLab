import java.io.*;
import java.util.*;
import java.lang.*;
public class TestClass {
	 public static void main(String[] args) { 
	Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        arr[j] = s.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(arr[j]+ " " );
		    }
		    
		    System.out.println();
        }
	}
}