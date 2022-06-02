package leetcode;

public class OddSubarray {
	public static int sumoddLength(int arr[])
	{
		int result = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int end = i + 1;
			int start = n-i;
		//*	System.out.println(start);
			int total = start * end;
			//*System.out.println(total);
			int odd = total / 2;
			if(total % 2 == 1)
			{
				odd++;
			}
			result = result + odd * arr[i];
			//*System.out.println(odd);
		}
		return result;
	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,5,3};
        System.out.println(sumoddLength(arr));
	}

}
