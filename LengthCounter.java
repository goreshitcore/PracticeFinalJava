import java.util.ArrayList;

public class LengthCounter {

	public ArrayList<Integer> lengthCounter(ArrayList<String> words)
	{
        //Make new arraylist to hold length count
	    ArrayList<Integer> lengthCounter = new ArrayList<>();   
        //loop through words 
	    for ( String w : words ) {
            //add length of words to lenght counter
	        lengthCounter.add(w.length());
	    }
	    return lengthCounter;
	    
	}
}
