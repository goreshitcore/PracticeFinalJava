public class StringCopy {
    String input;
    int k;

    public static String copy(String input,int k)
	{
      String cop = input.repeat(k);


	  return cop;
	  
	}
    public static void main(String[] args) {

        System.out.println(copy("Banks",2));

    }

}
