import java.io.*;
import java.util.*;
import java.lang.StringBuffer;
class Rotate{
	public void reverseEachWordOfString(String inputString){
      	String[] lol=inputString.split(" ");
        String c="";
        for(String i:lol){
			StringBuffer a=new StringBuffer(i);
         	c=c+a.reverse()+" ";
      
    	}
      System.out.print(c.trim());
}
}
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String inputstring=sc.nextLine();
       Rotate objname=new Rotate();
       objname.reverseEachWordOfString(inputstring);
	}
}