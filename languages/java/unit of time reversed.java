import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
       long in=sc.nextLong();
       System.out.println("Duration");
       long sec=in%60;
       long days = in/(24*60*60);
       long hrs=(in%(24*60*60))/(60*60);
       long min=((in%(24*60*60))%(60*60))/60;
       System.out.println(days+" days");
       System.out.println(hrs+" hours");
       System.out.println(min+" minutes");
       System.out.println(sec+" seconds");
	}
}