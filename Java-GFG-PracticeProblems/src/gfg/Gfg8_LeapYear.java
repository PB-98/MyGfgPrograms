package gfg;

import java.util.Scanner;

public class Gfg8_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if(year%4==0 && year%100!=0)
			System.out.println("Yes,"+year + " is a leap year");
		else if(year%400==0)
			System.out.println("Yes,"+year + " is a leap year");
		else
			System.out.println("No,"+year + " is not a leap year");
	}

}
