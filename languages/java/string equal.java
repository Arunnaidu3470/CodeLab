import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Scanner ob=new Scanner(System.in);
       int a=ob.nextInt();
       int b=ob.nextInt();
       int f=0;
       int ar[]=new int[a];
       int arr[]=new int[b];
       for(int i=0;i<a;i++)
         ar[i]=ob.nextInt();
       for(int j=0;j<b;j++)
         arr[j]=ob.nextInt();
       if(a!=b)
         System.out.println("Arrays are not equal");
       else
       {
         for(int i=0;i<a;i++)
         {
           if(ar[i]!=arr[i])
           {
             f=f+1;
             break;
           }
         }
         if(f==1)
           System.out.println("Arrays are not equal");
         else 
           System.out.println("Arrays are equal");
       }
		
	}
}