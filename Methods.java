public class Methods {

    String input;
    char ch;//ch we want to remove

//String filter method
    public static String filter(String input, char ch) {
        String filter = "";
//Initilize filtered string
        for ( char x : input.toCharArray()) {
            //Looping thru each character
            if ( x != ch) {
                //check if each character is not equal to ch and 
                //if it's not increment the filter
                filter += x;
            }
        }

        return filter;
    }

    public static void main(String[] args) {
        System.out.println(filter("abc",'a'));
    }


}
