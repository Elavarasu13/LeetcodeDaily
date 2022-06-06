package leetcode;

import java.util.Arrays;

public class SmallerthanCurrentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8,1,2,2,3};
		int ans[] = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int count =0;
		for(int j = 0;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				count++;
			}
			ans[i] = count;
		}
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(ans[i]);
		}
	}

}
