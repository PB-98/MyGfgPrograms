package gfg;

import java.util.Scanner;

public class Gfg25_PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==1) {
        	System.out.println("Not prime nor composite");
        }
        else {
        for(int i=2;i<=n/2;i++) 
        {
        	if(n%i==0)
        	{
        		count++;
        		break;
        	} 	
        }
        if(count==0)
        	System.out.println(n+" is a Prime Number");
        else
        	System.out.println(n+" is not a Prime Number");	
	    }
	}

}
