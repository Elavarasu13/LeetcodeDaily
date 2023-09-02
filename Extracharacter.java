package LeetcodeProblems;

public class ExtraCharacterString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "leetcode";
		String dictionary[] = {"leet" ,"code","leetcode"};
		for(int j = 0;j<dictionary.length;j++)
			{
			if(dictionary[j].equals(s))
			{
				System.out.println("yes");

		     }
			else 
			{
				System.out.println(dictionary[j]);
			}
		
			}
		}

	}

