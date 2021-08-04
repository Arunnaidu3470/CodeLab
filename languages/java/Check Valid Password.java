import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		String n;
       Scanner in = new Scanner(System.in);
       n=in.next();
       boolean output = test(n);
       if(output)
         System.out.print("Password is valid");
       else
         System.out.print("Not a valid password");
	}
  public static boolean test(String str)
  {
    boolean flag=false;
    if(str.length()>=10)
    {
      int count=0;
      for(int i=0; i<str.length(); i++)
        if(str.charAt(i)>=48 && str.charAt(i)<=57)
          count++;
      if(count>=2)
        flag=true;
    }
    return flag;
  }
}