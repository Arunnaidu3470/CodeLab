import java.io.*;
import java.util.Scanner;
class Shape
{
  Scanner in = new Scanner(System.in);
  int length, breadth;
}
public class TestClass extends Shape
{
int area;
void calculateArea()
{
area=length*breadth;
}
	public static void main(String[] args)
    { 
    Scanner in=new Scanner(System.in);
       TestClass r = new TestClass();
       r.length=in.nextInt();
       r.breadth=in.nextInt();
       r.calculateArea();
       System.out.println("Area="+r.area);
	 }
}