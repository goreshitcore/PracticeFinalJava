public class isClosedd {
    String input;

    public static void main(String[] args) {
        System.out.println(isClosed(new String("CLOSED")));
        System.out.println(isClosed(new String("This store is clOSED.")));

    }
    public static boolean isClosed(String input)
	{
        input = input.toUpperCase();
        if ( input.contains("CLOSED" )) {
            return true;
        }
      
		return false;

	}
}
