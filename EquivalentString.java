package leetcode;

public class EquivalentString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] str = {"ab", "c"};
		String[] str1 = {"a","bc"};
		StringBuilder w1 =  new StringBuilder();
		for(int i=0;i<str.length;i++)
		{
			w1.append(str[i]);
		}
		StringBuilder w2 = new StringBuilder();
		for(int i=0;i<str1.length;i++)
		{
		w2.append(str1[i]);	
		}
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w1.toString().equals(w2.toString()));
		
	}

}
