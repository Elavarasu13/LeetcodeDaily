package leetcode;

public class SingleNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int nums[] = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
		
      
    	  }
	public static int singleNumber(int[] nums) {
		int val = 0;
		for(int i= 0;i<nums.length;i++)
		{
			val = val^nums[i];
		}
		return val;
	}
	}
	


