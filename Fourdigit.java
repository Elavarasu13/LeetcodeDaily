package leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Fourdigit {

public static  int minimumSum(int num)
{
int arr[] =  new int[4];
int i = 0;
while(num>0)
{
	arr[i] = num %10;
	num  = num /10;
	System.out.println(arr[i]);
	i++;
}
Arrays.sort(arr);
int a = arr[0] *10 + arr[3];
int b = arr[1] *10 + arr[2];
System.out.println(a);
System.out.println(b);
return a+b;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(minimumSum(a));
		
				
	

	}

}
