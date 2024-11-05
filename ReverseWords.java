
public class ReverseWords {

    String sentence;

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello World")[0]);
        System.out.println(reverseWords("Hello World")[1]);

    }

    public static String[] reverseWords(String sentence)
	{		  	
        String[] result = sentence.split(" ");
        //new string to hold reversed word
        String[] reversedWords = new String[result.length];

        //loop to reverse the sentence
        for ( int i = 0; i < result.length; i++ ) {
            reversedWords[i] = result[result.length - 1 - i]; 
        }
        return reversedWords;


	    
	}



}
