import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class TestClass 
{
 
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int s = in.nextInt();
			int[] arr = new int[s];
			for (int i = 0; i < s; i++)
            {
				arr[i] = in.nextInt();
			}
			int u = in.nextInt();
			int n = arr[u - 1];
			Arrays.sort(arr);
			for (int i = 0; i < s; i++)
            {
				if (arr[i] == n) {
					u = i + 1;
				}
			}
			System.out.println(u);
		}
	}
}