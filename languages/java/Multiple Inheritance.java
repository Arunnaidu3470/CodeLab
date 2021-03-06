import java.io.*;
import java.util.Scanner;
interface Bank
{
  float rate=12.0f;
  int no_of_years=3;
  void show();
}
class Customer
{
  String name;
  int id;
  Customer(String n, int i)
  {
    name=n;
    id=i;
  }
  void display()
  {
    System.out.println("Customer Name="+name);
    System.out.println("Customer Id="+id);
  }
}
class Account extends Customer implements Bank
{
  int acc_no;
  float acc_bal;
  Account(String n, int b, int x, float y)
  {
    super(n,b);
    acc_no=x;
    acc_bal=y;
  }
  public void show()
  {
    super.display();
    System.out.println("Account No="+acc_no);
    System.out.println("Account Balance="+acc_bal);
  }
  void interest()
  {
    show();
    float interest = (rate*acc_bal*no_of_years)/100;
    System.out.print("Interest="+interest);
  }
}
public class TestClass {
	 public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
        String n=in.next();
        int i=in.nextInt();
        int ac=in.nextInt();
        float b=in.nextFloat();
        Account obj = new Account(n,i,ac,b);
        obj.interest();
	}
}