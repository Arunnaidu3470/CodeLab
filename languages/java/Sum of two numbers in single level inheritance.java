import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Derived d1 = new Derived();
       d1.getInput();
       d1.sum();
       d1.display();

	}
}
class Base
{
  int a,b;
public void getInput()
{
Scanner sc = new Scanner(System.in);
 a = sc.nextInt();
   b = sc.nextInt();
}
}
class Derived extends Base
{
int total;
public void sum()
{
total = a+b;
}
public void display()
{
System.out.println(total);
}
}