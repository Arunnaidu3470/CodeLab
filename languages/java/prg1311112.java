//Question:
//id:1311112
//Financial application: calculate interest:

//QUESTION DESCRIPTIONI:
//f you know the balance and the annual percentage interest rate, 
//you can compute the interest on the next monthly paymentusing the 
//following formula: interest = balance * (annualInterestRate/1200)
//Write a program that reads the balance and the annual percentage interest rate and displays the 
//interest for the next month.Use Data Type as Double

//TEST CASE 1:
//INPUT: 272507
//OUTPUT: 158.96

//TEST CASE 2:
//INPUT:342004
//OUTPUT:114.00

import java.io.*;
public class prg1311112 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double balance,interest;
        double nextMonthInterest;
        //System.out.println("getting balance:");
        balance=Double.parseDouble(br.readLine());
        //System.out.println("getting interest percent");
        interest=Double.parseDouble(br.readLine());
        nextMonthInterest=balance*(interest/1200.0);
        System.out.printf("%.2f",nextMonthInterest);
        //System.out.println(nextMonthInterest);
    }
}