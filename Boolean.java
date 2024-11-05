public class Boolean {
    String input;
    public static boolean decision(String input)
	{
        input = input.toUpperCase();
        if (  input.equals("YES")) {
            return true;
        }
		return false;

	}
    public static void main(String[] args) {
        System.out.println(decision(new String("YES")));
        System.out.println(decision("NO"));
        System.out.println(decision("yeS"));
        System.out.println(decision("CAT!"));


    }
}
