package LeetcodeProblems;
import java.util.Scanner;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {0,1,1,2,2};
System.out.println(removeElement(arr));
	}
	
	public static int removeElement(int[] nums) 
    {
		int k = 0;
		for(int i = 0 ;i<nums.length;i++)
		{
			if(i < nums.length -1 && nums[i] == nums[i+1])
			{
				continue;
			}
		nums [k] = nums[i];
		k++;
		}
   return k;
				
}
}
