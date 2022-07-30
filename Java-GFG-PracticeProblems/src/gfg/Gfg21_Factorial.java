package gfg;

import java.util.Scanner;

public class Gfg21_Factorial {

	static int factorial(int n) {
		
		int fact=1;;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
		System.out.println(Gfg21_Factorial.factorial(n1));
		
	}

}
