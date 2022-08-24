package leetcode;

public class Max69 {

	public static void main(String[] args)
	{
		// TODO Auto-generated 
		int  num = 9669;
		System.out.println(Maxnumber(num)); 
		
	}

	private static int Maxnumber(int num) {
		// TODO Auto-generated method stub
		char[] ans = String.valueOf(num).toCharArray();

	    for (int i = 0; i < ans.length; ++i)
	      if (ans[i] == '6') {
	        ans[i] = '9';
	        break;
	      }

	    return Integer.valueOf(String.valueOf(ans));		
	}

}
		