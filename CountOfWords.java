package leetcode;

public class CountOfWords {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String sentences[] =  {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(CountWords(sentences));
		

	}

	public static int  CountWords(String[] sentences) 
	{
		 String words;
	        int length=0;
	        int maximum=0;
	        for(int i=0;i<sentences.length;i++){
	            words = sentences[i];
	            length = Math.max(words.split(" ").length,maximum);
	            maximum = length;           
	        }
	        return maximum;
	}

}
