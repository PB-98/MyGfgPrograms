package gfg;

import java.util.Scanner;

public class Gfg27b_Prime {
	
	//this code is an optimized version of primecheck 
	//0(root(n))

	static boolean primeCheck(int n) {
		if(n==1)
			return false;
		for(int i=2;i*i<=n;i++) 
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Gfg27b_Prime.primeCheck(n));
	}

}
