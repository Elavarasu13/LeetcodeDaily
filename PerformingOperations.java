package leetcode;

public class PerformingOperations {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Expected op -1//
		String s []= {"x--", "--x","x++"};
		int x =0;
        for(int i = 0;i<s.length;i++)
        {
        	if(s[i].charAt(1) == ('+'))
        	{
        		x = x+1;
        	}
        	else {
        		x=x-1;
        	}
        }
        System.out.println(x);

	}
}