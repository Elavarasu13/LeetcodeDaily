package leetcode;

public class RunLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {1,2,3,4};
   
   int[] output = decompressRLElist(arr);
   for(Integer x: output)System.out.print(x+" ");
   

}

	public  static int[] decompressRLElist(int[] arr) {
		
		int temp[] = new int[arr.length];
		  int k = 0;
		   for(int i=0;i<arr.length;i+=2)
		   {
		       for(int j=0;j<arr[i];j++)
		           temp[k++] = arr[i+1];
		   }
		return temp;
	}
}

