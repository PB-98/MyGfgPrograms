package gfg;

import java.util.Scanner;

public class Gfg23_LCM {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int lcm=0;
        int large=Math.max(n1, n2);
        for(int i=large; ;i++) 
        {
        	if(i%n1==0 && i%n2==0) 
        	{
        		lcm=i;
        		break;
        	}
        }
        System.out.println(lcm);
	}
}
