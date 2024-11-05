public class CompaassApp {
    enum Compass {
        NORTH,SOUTH,EAST,WEST


    }

    public static void main(String[] args) 
	{
	    //complete for loop with values() method from Compass
		for(Compass c : Compass.values()) 
		{
			System.out.println(c);
		}

	}
}
