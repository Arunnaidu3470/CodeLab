import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       double b=ob.nextDouble();
       double c=ob.nextDouble();
       System.out.printf("%.2f",(-1*b+Math.sqrt(b*b-4*c))/2);
       System.out.println();
       System.out.printf("%.2f",(-1*b-Math.sqrt(b*b-4*c))/2);
		
	}
}