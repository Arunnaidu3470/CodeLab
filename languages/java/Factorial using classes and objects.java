import java.io.*;
import java.util.Scanner;
class Sample
{
  public int fact(int n)
  {
    if(n==1||n==0)
      return 1;
    else
      return(n*fact(n-1));
  }
}  
    
public class TestClass 
{
	 public static void main(String[] args) 
     { 
       Scanner in = new Scanner(System.in);
		Sample objname= new Sample();
       int num=in.nextInt();
       int answer= objname.fact(num);
       System.out.println(answer);
	}
}