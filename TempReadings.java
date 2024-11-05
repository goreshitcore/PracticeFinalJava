import java.util.ArrayList;

public class TempReadings {
	ArrayList<Double> list;
    public final static Double min = -88.0;
	public final static Double max = 56.7;
	//constant variables to represent min and mac temps in celcius

    //constructor with ArrayList<Double>
    public TempReadings(ArrayList<Double> list) throws InvalidReading {
        if(invalidReading(list) != null){
            throw new InvalidReading(invalidReading(list));
        }
        this.list = list;
    }

    //avg method
    public Double average() 
    {
    //if list is empty return 0    
    if ( list.isEmpty()) {
        return 0.0;
    }
    //sum of double is initlized to 0
    double sum = 0.0;
    //iterate thru double values in the list and sums the readings
    for ( Double value : list ) {
        sum += value;
    }
    //returns the sum divided by the size of the list
    return sum / list.size();
}
    //check if the reading is valid
    Double invalidReading(ArrayList<Double> list)
    {
        //if the value is less that minimum or greater than maxx  it will return the value back;
        for (Double value : list ) {
            if ( value < min || value > max) {
                return value;
            }
        } //if it is inside the boundaries return null
    return null;		
    }


    
}
