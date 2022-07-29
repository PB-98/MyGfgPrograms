package gfg;

import java.util.Scanner;

public class Gfg2_EvenOdd {

	public void evenorodd(int num1)
	{
		if(num1%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Gfg2_EvenOdd obj =new Gfg2_EvenOdd();
        obj.evenorodd(num);
	}

}
