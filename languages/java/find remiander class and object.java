import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
       Reminder f=new Reminder();
       f.computeReminder();
		
	}
}
  class Reminder
  {
    public void computeReminder()
    {
      Scanner ob=new Scanner(System.in);
      int T=ob.nextInt();
      for(int i=0;i<T;i++)
      {
        int n1=ob.nextInt();
        int n2=ob.nextInt();
        System.out.println(n1%n2);
      }
    }
  }
