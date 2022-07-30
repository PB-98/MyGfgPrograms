package gfg;

import java.util.Scanner;

public class Gfg22_GCD {

	static int gcd(int n1,int n2) {
		int small=n1<n2?n1:n2;
		int gcd=0;
		for(int i=1;i<=small;i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		return gcd;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(Gfg22_GCD.gcd(n1,n2));
	}

}
