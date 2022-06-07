package LeetcodeDaily;

public class MergeSortArray {
	    public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int s1 = m-1 , s2 = n-1 ,  i = m+n-1;
	        while(s2 >= 0)
	        {
	            if(s1 >= 0 && nums1[s1] > nums2[s2])
	            {
	                nums1[i--] = nums1[s1--];
	            }
	            else{
	                nums1[i--] = nums2[s2--];
	            }
	        }
	    }
	
	
}
