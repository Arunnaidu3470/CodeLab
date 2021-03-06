import java.io.*;
import java.util.Scanner;
interface Gross
{
  double TA=800.0;
  double DA=1500.0;
  void gross_sal();
}
class Employee
{
  String name;
  float basic_sal;
  Employee(String n, float b)
  {
    name=n;
    basic_sal=b;
  }
  void display()
  {
    System.out.println("Name of Employee="+name);
    System.out.println("Basic Salary of Employee="+basic_sal);
  }
}
class Salary extends Employee implements Gross
{
  float hra;
  Salary(String n, float b, float h)
  {
    super(n,b);
    hra=h;
  }
  void disp()
  {
    super.display();
    System.out.println("HRA of Employee="+hra);
  }
  public void gross_sal()
  {
    double gs=TA+DA+hra+basic_sal;
    System.out.println("TA of Employee="+TA);
    System.out.println("DA of Employee="+DA);
    System.out.print("Gross Salary of Employee="+gs);
  }
}

public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
        String n = in.next();
        float b=in.nextFloat();
        float h = in.nextFloat();
        Salary s = new Salary(n,b,h);
        s.disp();
        s.gross_sal();
	}
}