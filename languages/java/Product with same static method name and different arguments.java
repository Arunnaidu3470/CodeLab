import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
int num1,num2,num3;
       Scanner sc = new Scanner(System.in);
       num1 = sc.nextInt();
       num2 = sc.nextInt();
       num3 = sc.nextInt();
       System.out.println(TestClass.productTwo(num1,num2));
       System.out.println(TestClass.productTwo(num1,num2,num3));
}
static int productTwo(int a,int b) 
{
  int product = a*b;
    return(product);
}
 static int productTwo(int a,int b,int c)
  {
  return(a*b*c);
  }
}
  