package leetcode;
import java.util.Arrays;
import static java.lang.Math.*;
public class MoveSeats 
{

	public static void main(String[] args)
	{
		int seats[] = {3,1,5};
		int students[] = {2,7,4};
		/*Explanation: 
		 The students are moved as follows:
		- The first student is moved from from position 2 to position 1 using 1 move.
		- The second student is moved from from position 7 to position 5 using 2 moves.
		- The third student is moved from from position 4 to position 3 using 1 move.
		In total, 1 + 2 + 1 = 4 moves were used.*/
		System.out.println(minMovesToSeat(seats,students));

	}
	
	public static int minMovesToSeat(int[] seats, int[] students)
	{
		int moves = 0;
	    Arrays.sort(seats);
	    Arrays.sort(students);
	    for(int i=0;i<seats.length;i++)
	    moves = moves + abs(seats[i]-students[i]);
		return moves;
		
	}

}
