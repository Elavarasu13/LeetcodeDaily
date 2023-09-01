package LeetcodeProblems;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String binary = "";
		int rem ;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Decimal number:");
		 int decimal = sc.nextInt();
		 while(decimal > 0)
		 {
			  rem  = decimal % 2;
			  binary = rem + binary;
			  decimal = decimal /2 ;
		 }
		 System.out.println(binary);

	}

}
