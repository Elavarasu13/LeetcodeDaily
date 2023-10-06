package LeetcodeProblems;
import java.util.Scanner;
public class PowerofTwo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int  n = sc.nextInt();
		System.out.println(poweroftwo(n));
        
	}
	
	public static boolean poweroftwo(int n)
	{
		
		 return n>0 && (n & (n-1)) == 0;
}
}
