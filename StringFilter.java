public class StringFilter {
    String input;
    char ch;
    public static String filter(String input,char ch)
	{
        String filter = ""; //empty string to hold result of filtering process

        //for loop where char x iterates over the input convered to char
        for ( char x : input.toCharArray()) { 
            //checks if the x character matches char ch if not 
            if ( x  != ch) {
                //+= concantates or adds values to reassign result
                filter += x;
            }
        }
     return filter;


	}
    public static void main(String[] args) {
        System.out.println(filter("abc",'a'));
        System.out.println(filter("abcde f",' '));
        System.out.println(filter("abcxyz23455",'5'));
        System.out.println(filter("1111111111",'1'));


    }
}
