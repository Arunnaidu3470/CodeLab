import java.io.*;
import java.util.Scanner;
public class TestClass {
  public static void main (String args[])
    {
      Scanner in=new Scanner(System.in);
        String s=in.nextLine();
		 int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ')
            System.out.print(ch);
        }
}
}