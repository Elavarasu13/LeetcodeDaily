package leetcode;

import java.util.Scanner;

public class PowerOfThree {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the N value");
		int n =  sc.nextInt();
	System.out.println(Powerofthree(n));

	}

	private static boolean Powerofthree(int n) 
	{
		// TODO Auto-generated method stub
	   if( n == 0)
		   return false;
	   return (Math.log10(n) / Math.log10(3)) %  1 == 0; 
	}

}
