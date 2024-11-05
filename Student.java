public class Student extends UniPerson {


    /*
 * by using the extends keyword in the class declaration to subclass UniPerson
declaring the private String-typed instance variable id
Write a constructor initialising name and id with input parameters
overriding the String toString() method to return name and id on seperate lines in standard output format
 */
private String id;
private String name;


    public Student(String name, String id) {
        super(name);
        this.name = name;
        this.id = id;
    }
    
  
    @Override
    public String toString() {
        return super(name) + "\nid = " +id;
    }

    public static void main(String[] args) {
        UniPerson p = new UniPerson("RobinBanks");
        System.out.println(p);

        Student s = new Student("RobinBanks","123");
        System.out.println(s.toString());
    }
}
