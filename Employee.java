public class Employee {

    //Declaring protected String type instance variables name and id
    //Writing the constructor to initialise name and id with input parameters
    //Writing the public int pay() method which returns the integer value 1700
    protected String name, id;

    public Employee() {
        this.name = "";
        this.id = "";
    }

    // Parameterized constructor
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

      public int pay() {
        return 0;
      }
}
