package gfg;

import java.util.Scanner;

public class Gfg9_Calculator {
	
	public static int calculator(int operation, int a1, int b1)
	{
		if(operation==1)
			return a1+b1;
		if(operation==2)
			return a1-b1;
		if(operation==3)
			return a1*b1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select the Operation \n 1.Addition \n 2.Subtraction \n 3.Multiplication");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation");
        int operation=sc.nextInt();
        
        if(operation!=1 && operation!=2 && operation!=3)
        	System.out.println("Invalid Output");
        else {
        	System.out.println("Enter the first number");
        	int a=sc.nextInt();
        	System.out.println("Enter the second number");
        	int b=sc.nextInt();
        	
        	int result=Gfg9_Calculator.calculator(operation, a, b);
        	System.out.println(result);
        }
	}

}
