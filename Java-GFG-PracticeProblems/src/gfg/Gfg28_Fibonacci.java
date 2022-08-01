package gfg;

import java.util.Scanner;

public class Gfg28_Fibonacci {

	public static int fibo(int num) 
	{
		if(num==0)
			return 1;
		else if(num==1)
			return 1;
		else 
		 return fibo(num-1)+fibo(num-2);			
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("So the Fibonacci number is "+Gfg28_Fibonacci.fibo(n));
	}
}
