package gfg;

import java.util.Scanner;

public class Gfg27c_PrimeMoreEfficicent {
	
	static boolean primeCheck(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
	 
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Gfg27c_PrimeMoreEfficicent.primeCheck(n));
	}

}
