
package LeetcodeDaily;

public class RemoveSubstringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabb";
		System.out.println(Substing(s));

	}

	public static int  Substing(String s)
	{
		// TODO Auto-generated method stub
		 if (s.length() == 0)
	            return 0;
	        int left = 0;
	        int right = s.length() - 1;
	        while (left < right) {
	            if (s.charAt(left) == s.charAt(right)) 
	            {
	                left += 1;
	                right -= 1;
	            }
	            else 
	                return 2;
	        }
	        return 1;
}
}