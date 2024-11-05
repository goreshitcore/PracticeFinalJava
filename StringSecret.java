public class StringSecret {
    String input;
      public static String secret(String input)
      {
  
          
          String secretString = "";
          //for loop to iterate through input as characters 
          for(char ch : input.toCharArray()){
            //s changes the character by 1
              char s = (char) (ch + 1);
              
              secretString += s;
          }
          return secretString;
  
      }

	
    public static void main(String[] args) {
        System.out.println(secret("abc"));

    }
}
