package leetcode;

public class defangIp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "1.1.1.1";
		String words = defandIpaddr(str);
	}

	public static String defandIpaddr(String str) 
	{
		 String defang ="";
		 for(int i=0;i<str.length();i++)
		 {
		   char c = str.charAt(i);
		   if(c == '.')
		   {
			   defang = "[.]";
		   }
		   else {
			   defang += c;
		   }
		 }
		return defang;
	}
	}


