public class UniPerson {

    /*
     * declaring the private String-typed instance variable name
    Write a constructor initialising name with an input parameter
    Write get and set methods for the name instance variable
    Override the String toString() method to return name in upper case letters, in standard output format
     */

     private String name;

     public UniPerson(String name) {
        this.name = name;
     }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }  
    public String toString() {
    return super.toString() + name.toUpperCase();
    }

}
