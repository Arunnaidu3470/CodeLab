import java.io.*;
import java.util.Scanner;
public class TestClass {
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n,i;
float sum=0;
n=in.nextInt();
for(i=1;i<=n;i++)
sum=sum+(float)1/i;
  
System.out.printf("%.02f", sum);
}
}