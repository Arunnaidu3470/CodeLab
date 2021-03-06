import java.io.*;
import java.util.Scanner;
class Student
{
  Scanner in = new Scanner(System.in);
  private int rollno;
  private String name;
  public void getRollNo()
  {
    name=in.next();
    rollno=Integer.parseInt(in.next());
  }
  public void putRollNo()
  {
    System.out.print("Name="+name);
    System.out.print("\nRegno="+rollno);
  }
}

class Marks extends Student
{
    protected int m1=0,m2=0,m3=0;
    public void getMarks()
    {
        m1=in.nextInt();
        m2=in.nextInt();
        m3=in.nextInt();
    }
    public void putMarks()
    {
    	System.out.print("\nMark1="+m1);
        System.out.print("\nMark2="+m2);
        System.out.print("\nMark3="+m3);
    }
}

class Result extends Marks
{
  private float total;
  void computeDisplay()
  {
    total=m1+m2+m3;
    System.out.print("\nTotal="+(int)total);
  }     
}   
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
       Result r = new Result();
       r.getRollNo();
       r.getMarks();
       r.putRollNo();
       r.putMarks();
       r.computeDisplay();
	}
}