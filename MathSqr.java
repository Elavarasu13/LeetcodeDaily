package leetcode;

import java.util.Scanner;

public class MathSqr {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the x value");
			int x = sc.nextInt();
		    System.out.println(Sqrt(x));

		}
		public static int Sqrt(int x)
		{
			int start  = 1;
			int end = x;
			int res = 0;
			while(start <= end)
			{
			int mid = start + (end - start) /2;
			if(mid <=x/mid)
			{
				start = mid+1;
				res = mid;
			}
			else 
			{
				end = mid -1;
			}
			}
			return res;
			
		}

	}
