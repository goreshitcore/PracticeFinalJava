public class Test implements Comparable <Test> {

   
	public String firstName;
	
	public String lastName;

	//compareTo method here
	@Override
	public int compareTo(Test o)
	{//this.last initlising it then compare to p2 laast name
	    return this.lastName.compareTo(o.lastName);
	}
    
    public static void main(String[] args) {
        Test p1 = new  Test();
        p1.firstName = "Abba";
        p1.lastName = "Barb";
        Test p2 = new Test();
        p2.firstName = "Frank";
        p2.lastName = "Zappa";
        System.out.println(p1.compareTo(p2));
    }
}
