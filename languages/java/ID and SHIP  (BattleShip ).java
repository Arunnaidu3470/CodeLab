import java.io.*;
import java.util.Scanner;
public class TestClass 
{
	 public static void main(String[] args)
     { 
     Scanner in=new Scanner(System.in);
	 int x=in.nextInt();
       while(x>0)
       {
         char c=in.next(".").charAt(0);
       if(c=='c' || c=='C')
         System.out.println("Cruiser");
         else if(c=='b' ||c=='B')
           System.out.println("BattleShip");
         else if(c=='d' ||c=='D')
           System.out.println("Destroyer");
         else if(c=='f' ||c=='F')
           System.out.println("Frigate");
         x--;
       }
	}
}