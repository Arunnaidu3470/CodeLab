import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args) 
     { 
final Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
			final int[] clouds = new int[N];
		for(int i = 0; i < N; i++) {
			clouds[i] = in.nextInt();
		}
	  int noOfJumps = 0, i = 0;
		while(true)
        {
			if(i + 2 < N && clouds[i + 2] == 0) 
            {
				i += 2;
			} else if(i + 1 < N)
            {
				i++;
			}
          else 
            {
				break;
			}
			noOfJumps++;
		}
		System.out.println(noOfJumps);
        }
}