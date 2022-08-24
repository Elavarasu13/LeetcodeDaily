package leetcode;

public class LastwordLength {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 String str = " Hello World ";
	str = str.trim();
	System.out.println(str.length() - str.lastIndexOf(" ")-1);
	}

}
