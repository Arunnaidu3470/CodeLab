import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TestClass {
	 public static void main(String[] args) { 
		 int t;
        Scanner scan = new Scanner(System.in);
        
        t = scan.nextInt();
        
        for(int i = 0; i < t; i++){
            System.out.println(digits(scan.next()));
        }
        
        scan.close();
    }

    private static int digits(String number) {
       
       int sum = 0;
       char[] digits = number.toCharArray();
      
       for(int i = 0; i < number.length(); i++){
            if(Character.getNumericValue(digits[i]) != 0){ 
                if(((Integer.parseInt(number))% (Character.getNumericValue(digits[i]))) == 0){
                    sum++;
                }
            }
            else
                continue;
       }
           
        return sum;
	}
}