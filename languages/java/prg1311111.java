//Question:
//id:1311111
//Write a program that receives an ASCII code 
//(an integer between 0 and 127) and displays its character.

// TEST CASE 1:
// INPUT:65
// OUTPUT:A

//TEST CASE 2:
//INPUT:99
//OUTPUT:c

import java.io.*;
public class  prg1311111
{ 
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int val=Integer.parseInt(br.readLine()); 
        if(val<0&&val>127) return; 
        System.out.println((char)val);
    }
}