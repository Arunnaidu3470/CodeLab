import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
      
       Factorial f=new Factorial();
       f.fact();
		
	}
}
class Factorial
{
  void fact()
  {
     Scanner ob=new Scanner(System.in);
       int n=ob.nextInt();
    int f=1;
    for(int i=1;i<=n;i++)
    {
      f=f*i;
    }
    System.out.println(f);
  }
}