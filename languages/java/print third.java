import java.io.*;
import java.util.Scanner;
public class TestClass {
	 public static void main(String[] args) { 
		new Third().getInput();
	}
}
class Third{
  public void getInput(){
    Scanner sc=new Scanner(System.in);
    String input=sc.next();
    calculateThird(input);
  }
  public void calculateThird(String s){
    System.out.print(s.charAt(2));
  }
}