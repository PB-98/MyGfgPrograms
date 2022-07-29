package gfg;

import java.util.Scanner;

public class Gfg10_CountDigits {

	public static int count_digits(int n) {
		int count=0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int count=0;
       System.out.println("Enter the number");
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       
       int noOfdigits=Gfg10_CountDigits.count_digits(n1);
       System.out.println(noOfdigits);
       
	}

}
