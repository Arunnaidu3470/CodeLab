import java.io.*;
import java.util.Scanner;
class Sample
{
  public int adjacentElementsDifference(int arr[], int n)
  {
    int dif=arr[0]-arr[1];
    for(int i=1; i<n-1; i++)
    {
      int d = arr[i]-arr[i+1];
      if(d>dif)
        dif=d;
    }
    return dif;
  }
}
    
    
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       int arr[]=new int[100];
       int n=in.nextInt();
       for(int i=0; i<n; i++)
         arr[i]=in.nextInt();
       Sample obj = new Sample();
       int dif=obj.adjacentElementsDifference(arr,n);
       System.out.print(dif);
	}
}