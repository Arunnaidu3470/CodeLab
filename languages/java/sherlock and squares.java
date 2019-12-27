import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++){
         System.out.println(getSquares(sc.nextInt(),sc.nextInt()));
         }
       sc.close();
       }
  static long getSquares(int num1,int num2){
    if(num1==0) 
      num1++;
    Double x=Math.sqrt(num1);
    Double y=Math.sqrt(num2);
    long xLong=x.longValue();
    long yLong=y.longValue();
    long count=0L;
    for(long i=xLong;i<=yLong;i++){
      if((i*i)<=num2 && (i*i)>=num1)
        count++;
      }
     return count;
	}
}