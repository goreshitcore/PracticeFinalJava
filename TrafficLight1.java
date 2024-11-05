public class TrafficLight1 {

    public static void main(String[] args) 
    {
        TrafficLight1 tl = new TrafficLight1();
        for(int i = 0;i<5;i++)
        {			
	        System.out.println(tl.getLight());
	        tl.next();
        }
    }
    
    
        public enum Colour
        {
            Green, Yellow, Red;
        }
        
         Colour light;

        public Colour getLight() {
            return light;
        }
            
        public TrafficLight1() {
            this.light = Colour.Red;
        }        

        //complete this method
        public void next()
        {	
            switch(getLight()) {
                case Green:
                light = Colour.Yellow;
                break;
                case Yellow:
                light = Colour.Red;
                break;
                case Red:
                light = Colour.Green;
                break;
            }
        
        }
    
    
}
