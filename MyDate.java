
public class MyDate 
{

    Month month;
    int day;
    int year;


    public final static int minYear = 1900;
    public final static int maxYear = 2090;
    //------------------------------------------------------
    enum Month
    {
        January(31),February(28),March(31),April(30),May(31),June(30),July(31),
        August(31),September(30),October(31),November(30),December(31);

        private int numberDays;

        public int getNumberDays()
        {
            return this.numberDays;
        }

        private Month(int numberDays)
        {
            this.numberDays = numberDays;
        }
    }
    //------------------------------------------------------
    public String toString()
    {
        return this.month.toString()+" "+this.day+" "+this.year;
    }
    //------------------------------------------------------
    public boolean isLeapYear(int year)
    {
        //check divisibility of year by 4 using mod: (year % 4 == 0);
        if(year % 4 == 0){
            return true;
        }
        return false;
    }
    //------------------------------------------------------
    //throws an InvalidDate exception
    public  MyDate(int day,int month,int year) throws InvalidDateException 
    {

        //check validity of year (between min/max year)
        if(year < minYear || year > maxYear){
            throw new InvalidDateException("Invalid Year: "+year);
        }
        this.year = year;
        //check validity of month (between 1 - 12)
        
        if(month < 1 || month > 12){
            throw new InvalidDateException("Invalid Month: "+month);
        }
        this.month = Month.values()[month-1];
        //check validity of day, taking into account the leap year
        int maxDays = this.month.getNumberDays();
        if(this.month == Month.February && isLeapYear(year)){
            maxDays = 29;
        }
        if(day < 1 || day > maxDays){
            throw new InvalidDateException("Invalid Day: "+day);
        }
        this.day = day;
    
    }
    //------------------------------------------------------
}