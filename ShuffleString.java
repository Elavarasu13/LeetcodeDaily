package leetcode;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String s = "codeleet";
	  int []indices = {4,5,6,7,0,2,1,3};
	  int n = s.length();
	  char c [] =  new char[n];
	  for(int i=0;i<indices.length;i++)
	  {
		  c[indices[i]] = s.charAt(i);
	  }
	  System.out.println(c);
	}

}
