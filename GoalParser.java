package leetcode;

public class GoalParser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "G()(al)";
		int i =0;
		StringBuilder res = new StringBuilder();
        while(i < str.length()) {
            if(str.charAt(i) == 'G') {
                res.append("G");
                i++;
            } else if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
                res.append("o");
                i = i+2;
            } else {
                res.append("al");
                i = i+4;
            }
        }
		System.out.println(str.toString());

	}

}
