package LeetcodeProblems;

import java.util.Scanner;

public class CountingBits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String binary = "";
		int rem ;
		int quo;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Decimal number:");
		int decimal = sc.nextInt();
		// int arr [] = new int[decimal];
		// while(arr[decimal] > 0)
	//	 {
		//	  rem  = decimal % 2;
		//	  binary = rem + binary;
		///	  quo = decimal /2 ;
		// }
		rem  = decimal >> 1 + decimal % 2;
		System.out.println(decimal);

	}

}
