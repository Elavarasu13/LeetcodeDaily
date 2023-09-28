package LeetcodeProblems;

public class FindtheDifference {
	public static void main(String args[])
	{
	String s = "abcd";
	String t = "abcde";
	System.out.println(findTheDifference(s,t));
	}
	
public static char findTheDifference(String s, String t) {
	int result = 0; // Initialize result as 0

    for (char c : s.toCharArray()) {
    	System.out.println(c);
        result -= c; // Subtract ASCII value of characters from 's'
    }

    for (char c : t.toCharArray()) {
        result += c; // Add ASCII value of characters from 't'
    }

    return (char) result;
}

 }
        
    
