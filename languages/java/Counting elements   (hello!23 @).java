import java.io.*;
import java.util.Scanner;
public class TestClass
{
	 public static void main(String[] args)
     { 
		Scanner in = new Scanner(System.in);
       String l;
       l=in.nextLine();
       int uc=0,v=0,lc=0,dg=0,ot=0,len;
       len=l.length();
       for(int i=0; i<len; i++)
         if(l.charAt(i)>='a' && l.charAt(i)<='z')
           v++;
           else if(l.charAt(i)>='A' && l.charAt(i)<='Z')
         lc++;
       else if(l.charAt(i)>=48 && l.charAt(i)<=57)
         dg++;
       else if(l.charAt(i)==' ')
         uc++;
       else
         ot++;
       System.out.println("Letter="+(lc+v));
       System.out.println("Digit="+dg);
       System.out.println("Spaces="+uc);
       System.out.println("Symbol="+ot);
	}
}