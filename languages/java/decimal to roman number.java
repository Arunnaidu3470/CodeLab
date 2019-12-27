import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       if(num>0 && num<4000)
       {
         String thou[]={"","M","MM","MMM"};
         String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
         String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
         String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
         int th = num/1000;
         int h= (num/100)%10;
         int t =(num/10)%10;
         int u = num%10;
         System.out.println(thou[th]+hund[h]+ten[t]+unit[u]);
       }
       else
         System.out.println("Out of Range");
	}
}