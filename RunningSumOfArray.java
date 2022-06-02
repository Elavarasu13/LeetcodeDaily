package LeetcodeDaily;
import java.util.Scanner;

public class RunningSumOfArray {
	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the size of an aRRay");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		  for(int i = 0;i<size;i++)
			arr[i] = sc.nextInt();
		  int a[] = Sumofarray(arr);
		  for(int i =0;i < arr.length;i++)
		  {
		System.out.println(arr[i]);
		  }	

}

	public static  int[] Sumofarray(int[] arr)
	{
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
		sum = sum + arr[i];
		arr[i] = sum;
		}
		return arr;
	}
}