package leetcode;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] candies = {2,3,5,1,3};
	    int extraCandies = 3;
	    int max =0;
	    for(int i=0;i<candies.length;i++)
	    {
	    	if(candies[i] > max)
	    	{
	    		max = candies[i];
	    	}
	    }
	    for(int i =0;i<candies.length;i++)
	    {
	    	if(candies[i] + extraCandies >= max)
	    	{
	    		System.out.println("This candy  is maximum " + candies[i]);
	    	}
	    	else {
	    		System.out.println("This candy  is minimum " + candies[i]);
	    	}
	    }
	}

}
/*public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
int max = 0;
for(int i=0;i<candies.length;i++)
{
    if(candies[i] >max)
    {
        max = candies[i];
    }
}
List<Boolean> output = new ArrayList<>();
for(int i=0;i<candies.length;i++)
{
    if(candies[i] + extraCandies>=max)
    {
        output.add(true);
    }
    else
    {
        output.add(false);
    }
}
return output;*/

