package gfg;

import java.util.Scanner;

public class Gfg3_SumOfNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        if(num<=0)
        {
        	System.out.println("Invalid Input");
        	return;//to exit from a function incase of an Invalid input,we can always use return
        	
        }
        System.out.println((num*(num+1))/2);//no need of else part
//        else
//        {
//        	for(int i=1;i<=num;i++)
//        	{
//        		sum+=i;
//        	}
//        	System.out.println(sum);
//        }
	}

}
