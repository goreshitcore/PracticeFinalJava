public class HourlyEmployee extends Employee {
    private int hoursWorked;

    public HourlyEmployee() {
        super();
        this.hoursWorked = 40;
        
    }
   
	
	@Override
	public int pay()
	{
        return 150 * hoursWorked;
	}

    public static void main(String[] args) {
        Employee b = new Employee();
            try {
    System.out.println(b.getClass().getDeclaredField("name"));
    System.out.println(b.getClass().getDeclaredField("id"));
} catch (Exception e) 
{
    System.out.println("access modifier error for name instance variable");
}


    }
}
