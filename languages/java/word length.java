import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       String str=ob.nextLine();
       str=str+" ";
       int p=0;
       int len=0;
       for(int i=0;i<str.length();i++)
       {
        if(str.charAt(i)==' ')
        {
         String str1= str.substring(p,i);
          System.out.print(str1.length());
          p=i+1;
           
        }
        
          
       }
		
	}
}