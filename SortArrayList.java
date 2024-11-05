import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    
        public ArrayList<String> sort(ArrayList<String> words)
        {
            Collections.sort(words);
            return words;
        }


        public static void main(String[] args) {
            SortArrayList q = new SortArrayList();
            ArrayList<String> words = new ArrayList<String>();
		words.add("World");
		words.add("Zappa");
		words.add("Hello");
		words.add("Abba");
		q.sort(words);
		System.out.println(words);
        }


    }

