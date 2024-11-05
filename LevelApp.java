
    public class LevelApp {
	
	
        enum Levels {
            LOW,MED,HIGH
        }
        
         public String directions(Levels level) 
         {
             switch(level) {
                case LOW:
                return "Down";
                case MED:
                return "Stay";
                case HIGH:
                return "Up";
                default:
                return "?";
             }
            
             //use a switch statement to return the correct string
             //when level is 
             //LOW, return "Down"
             //MED, return "Stay"
            //HIGH, return "Up"
             //any other input return "?"		
        }
        
        
        public static void main(String[] args) 
        {
         LevelApp la = new LevelApp();
         
         System.out.println(la.directions(Levels.LOW));
         System.out.println(la.directions(Levels.MED));
         System.out.println(la.directions(Levels.HIGH)); 
             
        }
    
    }
    

