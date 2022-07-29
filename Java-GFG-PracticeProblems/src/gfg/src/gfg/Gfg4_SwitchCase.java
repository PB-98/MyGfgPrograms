package gfg;

import java.util.Scanner;

public class Gfg4_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the direction");
		char move=sc.next().charAt(0);
		
		switch(move)
		{
		case 'L':
			System.out.println("Move Left");
			break;
		case 'R':
			System.out.println("Move Right");
			break;
		case 'U':
			System.out.println("Move Up");
			break;
		case 'D':
			System.out.println("Move Down");
			break;
		default:
			System.out.println("Move No Where");
		}

	}

}
