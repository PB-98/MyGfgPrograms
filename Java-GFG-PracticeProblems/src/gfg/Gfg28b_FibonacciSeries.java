package gfg;

import java.util.Scanner;

public class Gfg28b_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
        	System.out.print(0);
        else if(n==1)
        	System.out.print(1);
        else
        {
        	System.out.print(0+" ");
        	System.out.print(1+" ");
        	int a=0;
        	int b=1;
        	for(int i=2;i<=n;i++)
        	{
        		int c=a+b;//a 0 b 1 c 1,  a 1 b 1 c 2 
        		a=b;
        		b=c;
        		System.out.print(b+" ");
        	}
        }
	} 

}
