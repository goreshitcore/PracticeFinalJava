public class ScheduleApp {

	
	//declare DaysOfWeek enum here
	enum DaysOfWeek {
        MONDAY,TUESDAY,WEDNESDY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    }
	
	
	public String whatToDo(DaysOfWeek day)
	{
        //use == equality to compare input day
		//with SATURDAY OR SUNDAY
		if ( DaysOfWeek.SATURDAY == day || DaysOfWeek.SUNDAY == day)
		
		if(true)
		{
			return "party";
		}
		return "work";
	}
	
	public static void main(String[] args) 
	{
		
		ScheduleApp app = new ScheduleApp();
		
		System.out.println(app.whatToDo(DaysOfWeek.SATURDAY));
		System.out.println(app.whatToDo(DaysOfWeek.SUNDAY));
		System.out.println(app.whatToDo(DaysOfWeek.MONDAY));
		
		
	}

}
