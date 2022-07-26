package gfg;

import java.util.Scanner;

public class Gfg7_GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	   System.out.println("Put the three numbers");
	   Scanner sc=new Scanner(System.in);
	   int a = sc.nextInt();
	   int b=  sc.nextInt();
	   int c=  sc.nextInt();
	   
//	   if(a>=b && a>=c)
//	   System.out.println(a);
//	   else if(b>=c && b>=a)
//	   System.out.println(b);
//	   else
//	   System.out.println(c);
	   
	   int max= Math.max(a, b);
	   int max1=Math.max(max, c);
	   System.out.println(max1);
	}

}
