import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int h=Integer.parseInt(s.substring(0,2));
       int m=Integer.parseInt(s.substring(3,5));
       if(h==12)
         h=0;
       if(m==60)
         m=0;
       int hr_Angle=(int)((h*60)*0.5);
       int min_Angle=(m*6);
       int angle=Math.abs(hr_Angle-min_Angle);
       System.out.print(angle+" Degree");
       
	}
}