import java.io.*;
import java.util.*;
public class TestClass {
	 public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String s1 = s;
       String c = sc.nextLine();
       String s2 = c;
   char a[] = s.toLowerCase().toCharArray();
       char b[] = c.toLowerCase().toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       c = Arrays.toString(b);
       s = Arrays.toString(a);
       
       if(s.equals(c)==true)
         System.out.println(s1 + " and "+ s2 + " are anagrams");
       else
         System.out.println(s1 + " and " + s2+" are not anagrams");
	}
}