package leetcode;

public class EvenNumberofDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int nums[] = {555,901,482,1771};
		int count = 0;
	   for(int  i = 0;i<nums.length;i++)
	   {
		   char num[] = String.valueOf(nums[i]).toCharArray();
		   if(num.length % 2 == 0)
		   {
			 count++;
		   }
	   }
	  System.out.println(count);
	}

}
