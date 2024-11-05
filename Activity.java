public class Activity 
{

	public enum Season {Winter,Spring,Summer,Fall};


	private Season[] seasons;


    //complete this method.
	public boolean recommend(Season season)
	{
        //goes thru seasons list to see when the activity is reccomended
        //for ( Array name : enum )
        for ( Season s : seasons) {
            //checks if season matches the given season 
            if ( s == season) {
                return true;
            }
        }
       

	return false;
	}


	public Activity(Season[] season)
	{
		this.seasons = season;		
	}


    public static void main(String[] args) {
        Activity swim = new Activity(new Activity.Season[] {Activity.Season.Summer,Activity.Season.Spring});
        System.out.println(swim.recommend(Activity.Season.Summer));
        System.out.println(swim.recommend(Activity.Season.Winter));
    }
}
