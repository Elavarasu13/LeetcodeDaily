package LeetcodeProblems;
import java.util.Scanner;
public class ValidParanthesis_20 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		if(s.isEmpty())
		{
			System.out.println(" empty ");
			
		}
		else {
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i) == '(' && s.charAt(i+1) == ')')
					System.out.println("True");
				if(s.charAt(i) == '{' && s.charAt(i+1) == '}')
					System.out.println("True");
					if(s.charAt(i) == '[' && s.charAt(i+1) == ']')
						System.out.println("True");	
			}
			
		}
	}

}
