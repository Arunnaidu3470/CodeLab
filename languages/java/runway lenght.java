import java.io.*;
import java.util.Scanner;
  public class TestClass{   
    public static void main(String[] args)
 { 
Scanner input =new aScanner(System.in);		
double speed = input.nextDouble();
 double accelaration =input.nextDouble();
 double length= ((speed *speed)/(2*accelaration));  
 System.out.println(length);    }
}