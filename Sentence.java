public class Sentence {
    String sentence;

    public static String[] reverseWords(String sentence)
	{		  	
	    
	    //split the array into seperate words as a space as the delimiter
		String[] result = sentence.split(" ");
        //array for reversed word
        String[] reverse = new String[result.length];
        //reversing the word with a loop
        //result.length gives us the total number of result
		for ( int i = 0; i  < result.length; i++) {
            //calculates the length of the result and - by 1 but the i is to make sure it counts backward
            reverse[i] = result[result.length - 1 - i]; 
        }
        return reverse;

	}

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World")[0]);

    }
}
