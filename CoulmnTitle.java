package LeetcodeProblems;
import java.util.Scanner;
public class CoulmnTitle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the column value:");
Scanner sc =  new Scanner(System.in);
String s = sc.nextLine(); 
System.out.println(titleToNumber(s));
	}
	public static int titleToNumber(String s) 
	{
		//A --> 1 , Z --> 26
		//Formula -- > if(abc) -- >> 26 
		int result = 0;
	    for (int i = 0; i < s.length(); i++)
	    {
	        result *= 26;
	        System.out.println(i);
	        System.out.println(result);
	        result += s.charAt(i) - 'A' + 1;
	    
	        System.out.println(result);
	    }
	
		
		return result;
		
	}
}
