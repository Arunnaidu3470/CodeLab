import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int testCses = in.nextInt();
		while(testCses--!=0)
		{
			long maxCut  = in.nextInt();
			if(maxCut==0 || maxCut==1)
			{
				System.out.println("0");
				continue;
			}
			
			long ans = maxCut/2;

			if(maxCut%2==0)
			{
				System.out.println(ans*ans);
			}
			else
			{
				System.out.println(ans*(ans+1));
			}
        }
	}
}