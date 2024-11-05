public class Password 
{

	static final private int SPECIAL_CHAR_COUNT = 2;
	static final private int MIN_LENGTH = 8;
	
	private enum Special 
	{
		semicolon(';'), question('?'), exclamation('!'), comma(','); 
		
		private char ch;
		
		private Special(char ch)
		{
			this.ch = ch;
			
		}		

        public char getChar() {
            return this.ch;
        }
	}
	
	private String seq;
	
	public String getPassword()
	{
		return this.seq;
	}
	
	public int specialCharCount(String seq)
	{
        int count = 0;
        for ( char c : seq.toCharArray()) {
            for ( Special special : Special.values() ) {
                if ( c == special.getChar()) {
                    count++;
                }
            }
        }
		return  count;
	}
    //It converts the input string into a character array and iterates through each character.
    //For each character, it checks if it matches any of the special characters in the enum. If a match is found, the count is incremented.
    //The method returns the total count of special characters.
	public Password(String seq) throws InvalidPassword
	{
        if ( seq.length() < MIN_LENGTH) {
            throw new InvalidPassword("Password needs 4 more characters");

        }
        int specialCharCount = specialCharCount(seq);
        if ( specialCharCount < SPECIAL_CHAR_COUNT ) {
            throw new InvalidPassword("Password needs 2 more special characters");
        }
        
		
        this.seq = seq;
	}
	
	public static void main(String[] args) 
	{
		
		try
		{
			new Password("12345678");
		}
		catch(InvalidPassword e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			new Password(";,!?");
		}
		catch(InvalidPassword e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			System.out.println((new Password("1234abc;,!?")).getPassword());
		}
		catch(InvalidPassword e)
		{
			System.out.println(e.getMessage());
		}
	}
}
