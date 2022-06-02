//DailyTask //
package leetcode;
import java.util.Scanner;

public class BinaryString {
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary value");
		String s = sc.next();
		System.out.println("enter the k value");
		int k = sc.nextInt();
		System.out.println(s.length());
		if(s.length()<k)
		{
			System.out.println("False");
		}
		else
		{
			for(int i = 0;i<s.length();i++)
		    
			System.out.println(s.substring(i,k));
		}
	}

}
