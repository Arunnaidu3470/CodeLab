import java.io.*;
import java.util.Scanner;
class Test{
  Scanner in = new Scanner(System.in);
  String n,d,p;
  int a;
  float m;
  public void getDetails()
  {
    n=in.nextLine();
    d=in.nextLine();
    p=in.nextLine();

    a=in.nextInt();
    m=in.nextFloat();
  }
  public void displayDetails()
  {
    System.out.println(n);
    System.out.println(d);
    System.out.println(p);
    System.out.println(a);
    System.out.print(m);
  }
}

public class TestClass {
  
	 public static void main(String[] args) { 
	   Scanner in = new Scanner(System.in);
       Test objname;
       objname = new Test();
       objname.getDetails();
       objname.displayDetails();
	}
}