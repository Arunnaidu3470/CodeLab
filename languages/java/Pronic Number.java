import java.io.*;
import java.util.Scanner;
public class TestClass 
{
  public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for(int i=0; i<n; i++)
        {
            if(i*(i+1) == n)
            {
                flag = 1;
                break;
            }
        }
         if(flag == 1)
            System.out.println("Yes");
        else
            System.out.println("No");      
    }
}