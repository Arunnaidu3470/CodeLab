import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
     Person objname=new Person();
       objname.inputData();
       objname.display();
       
		
	}
}
class Person
{
  private String name;
  private int yearOfBirth;
  private int yearOfDeath;
  void inputData()
  {
    Scanner ob=new Scanner(System.in);
    name=ob.nextLine();
    yearOfBirth=ob.nextInt();
    yearOfDeath=ob.nextInt();
  }
  void display()
  {
    if(yearOfDeath==-1)
      System.out.println(name+" is still alive");
    else
      System.out.println(name+" lived for "+(yearOfDeath-yearOfBirth)+" years");
  }
}