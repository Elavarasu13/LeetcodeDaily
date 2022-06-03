package leetcode;
import java.util.Scanner;
public class RichestCustomerWealth {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the row values");
		int row =  sc.nextInt();
		System.out.println("Enter the col values");
		int col = sc.nextInt();
		int [][] arr = new int[row][col];
		
		for(int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}	
		System.out.println(maximumWealth(arr));
}
	public static int maximumWealth(int[][] accounts)
	 {
		int max = 0;
		int sum = 0;
		for(int i = 0;i<accounts.length;i++)
		{
			for(int j =0;j<accounts[0].length;j++)
			{
				sum = sum + accounts[i][j];
			}
			if(sum > max)
				max =sum;
			sum = 0;
		}
		
		return max;
	        
	 }
}
