public class Person {
    String name;
    Integer age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        this.age = age;

        if ( age < 0 || age > 150) {
            throw new InvalidAgeException("Out of Range");
        }
       
    }    

    public static void main(String[] args) {
        try
    {
        new Person("Bob",-1);
    }
    catch(InvalidAgeException e)
    {
        System.out.println(e.getMessage());
    }

    try
{
    Person bob = new Person("bob",50);
    System.out.println("name = "+bob.name+"\n"+"age = "+bob.age);
}
    catch(InvalidAgeException e)
    {
        System.out.println(e.getMessage());
    }
    }


}
