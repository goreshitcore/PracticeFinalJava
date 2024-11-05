import java.util.Arrays;

public class anagram1 {

    public static void main(String[] args ) {
        System.out.println(anagram("silent","listen"));
        System.out.println(anagram("abc","bad credit"));

        System.out.println(anagram("astronomer","moon starer"));
        System.out.println(anagram("yes","no"));



    }


    String s1, s2;
    public static boolean anagram(String s1,String s2)
	{
        
    
        if ( s1.length() != s2.length()) {
            return false;
        }
        return true;

        
         

    } 

}


