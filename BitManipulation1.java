package leetcode;
import  java.util.Scanner;

public class BitManipulation1 {
	public static int divide(int dividend, int divisor) 
    {
        if (dividend == Integer.MAX_VALUE && divisor == -1) 
        	return Integer.MIN_VALUE;
        int ans = 0, sign = dividend > 0 == divisor > 0 ? 1 : -1;
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;
        if (dividend == divisor) return sign;
        for (int i = 0, val = divisor; dividend - divisor >= 0; i = 0, val = divisor) {
            while (val > 0 && dividend - val >= 0) val = divisor << ++i;
            dividend -= divisor << i - 1;
            ans += 1 << i - 1;
        }
        return sign < 0 ? -ans : ans;
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dividend:");
		int dividend = sc.nextInt();
		System.out.println("Enter the divisor");
		int divisor = sc.nextInt();
           System.out.println(divide(dividend,divisor));
		

	}

}
