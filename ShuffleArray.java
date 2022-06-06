package leetcode;

public class ShuffleArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		int a[] = shuffleArray(nums,n);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(a[i]);
		}

	}

	public static int[] shuffleArray(int[] nums, int n) {
		// TODO Auto-generated method stub
		int res[] = new int[nums.length];
        for(int i =0;i<n;i++)
        {
            res[2*i] = nums[i];
            res[2*i+1] = nums[n+i];
        }
        return res;
        
	}

}
