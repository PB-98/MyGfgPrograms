package gfg;

import java.util.Scanner;

public class Gfg24_AllDivisors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++) //we are running this upto root of n 
        //to reduce the complexity of program
        {
        if(n%i==0)
        {
        	System.out.print(i+" ");
            if(i!= n/i)
            	System.out.println(n/i);
        
        }
        
	  }

   }      
}
