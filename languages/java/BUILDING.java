import java.io.*;
import java.util.Scanner;
class Building{
	int length;
  	int width;
  	int ratePerSqFeet;
  	public void initializeData(int l,int b,int r){
    	length=l;
      	width=b;
      	ratePerSqFeet=r;
    }
  	public int  getLength(){
    	return length;
    }
  	public int  getWidth(){
    	return width;
    }
  	public int  getRatePerSqFeet(){
    	return ratePerSqFeet;
    }
  	public int calculateCost(){
    	return (length*width*ratePerSqFeet);
    }
  	public void determineSuitability(){
    	int a=length-width;
      	if(a<0){
        	a=-a;
        }
      	if(a<10){
        	System.out.println("Suitability : Suitable");
        }
      	else{
        	System.out.println("Suitability : Not Suitable");
        }
    }
}
public class TestClass {
	 public static void main(String[] args) { 
		Building objname=new Building();
        Scanner sc=new Scanner(System.in);
        int l,b,r;
       	l=sc.nextInt();
       	b=sc.nextInt();
        r=sc.nextInt();
        objname.initializeData(l,b,r);
        System.out.println("Length : "+objname.getLength());
        System.out.println("Width : "+objname.getWidth());
        System.out.println("Rate Per SqFt : "+objname.getRatePerSqFeet());
        System.out.println("Cost of the Building : "+objname.calculateCost());
        objname.determineSuitability();
	}
}