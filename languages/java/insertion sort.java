import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		InsertionSort obj = new InsertionSort();
       obj.getInput();
       obj.sortArr();
     }
}
class InsertionSort
{
  Scanner sc = new Scanner(System.in);
int a[] = new int[100];
 int n,temp,j,i;
public void getInput()
 {
n = sc.nextInt();
   for(i=0;i<n;i++)
a[i] = sc.nextInt();
 }
  public void sortArr()
  {
  for(i=1;i<n;i++)
  {
  int key = a[i];
    j = i-1;
    while(j>=0 && a[j] > key)
    {
    a[j+1] = a[j];
      j-=1;
    }
    a[j+1] = key;
  }
    for(i=0;i<n;i++)
      if(i!=n-1)
      System.out.print(a[i] + " ");
    else
      System.out.print(a[i]);
  }
}