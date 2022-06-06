package leetcode;

public class JewelsStones {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String  jewels = "aA";
		String stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels,stones));
		
	}

     public static int numJewelsInStones(String jewels, String stones) {
		// TODO Auto-generated method stub
    	 int count = 0;
         int jlen = jewels.length();
         int slen = stones.length();
         for(int i =0;i<slen;i++)
         {
             for(int j=0;j<jlen;j++)
             {
                 if(stones.charAt(i) == jewels.charAt(j))
                 {
                     count++;
                 }
             }
         }
         return count;
	}

}
