import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       String str=ob.nextLine();
       int f=0;
      for(int i=0;i<str.length()-1;i++)
      {
        for(int j=i+1;j<str.length();j++)
        {
          if(str.charAt(i)==str.charAt(j))
          {
            System.out.println(str.charAt(i)+"="+2);
          }
        }
      }
		
	}
}