import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
       float bp,hra,da,bon;
       bp=sc.nextFloat();
       hra=(bp*80)/100;
       da=(bp*40)/100;
       bon=(hra*25)/100;
       System.out.println("Total Salary= "+(bp+hra+da+bon));
       
       
	}
}