import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       String str=ob.nextLine();
       int f=0;
       for(int i=0;i<str.length();i++)
       {
         if((i+3)==str.length())
           break;
         
         String temp=str.substring(i,i+4);
         if(temp.charAt(0)=='c'&&temp.charAt(1)=='o'&&temp.charAt(3)=='e')
           {
           f=f+1;
            
           }
           
           
           
         
       }
            System.out.println(f);
       
		
	}
}