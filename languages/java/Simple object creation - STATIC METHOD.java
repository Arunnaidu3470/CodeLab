import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Employee.getDetails();
       Employee.displayDetails();
		
	}
}
class Employee
{
 static String str1,str2,str3,str4,str5;
  static void getDetails()
  {
    Scanner ob=new Scanner(System.in);
    str1=ob.nextLine();
    str2=ob.nextLine();
    str3=ob.nextLine();
    str4=ob.nextLine();
    str5=ob.nextLine();
  }
  static void displayDetails()
  {
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);
  }
  
}