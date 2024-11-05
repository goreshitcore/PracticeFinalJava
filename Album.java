public class Album extends Media
{
    //private string instance variable
    private String[] tracks;
    //get method for tracks
  
    //constructor
    public Album(String title, String[] tracks) {
        //calling title variable from Media
        super(title);
        this.tracks = tracks;
    }
    //get method
    public String[] getTracks() {
        return tracks;
    }
    
    //string to string
    public String toString() {
        //storing the result with the title and traackks
        //calling super string from Media
      String result = super.toString() + "\ntracks = " ;
      
      //for loop to go through the tracks
      for ( int i = 0; i < tracks.length; i++)
        {
         //adds current track to the result 
        result += tracks[i];

        //loops through length to add a space between traacks
        if ( i < tracks.length - 1) {
            //adds whitespace
            result += " ";
        }

        }

        
        return result;

    }

    public static void main(String[] args) {
        Album album = new Album("Album",new String[] {"Track_1","Track_2","Track_3","Track_4"});
        System.out.println(album);

        Album album1 = new Album("Album",new String[] {"Track_1","Track_2","Track_3","Track_4"});
        System.out.println("Testing getTracks method: "+album.getTracks()[0]);

        Media media = new Media("Title");
        System.out.println("Testing get method: "+media.getTitle());
    }

    
}
