public class Amimal implements Comparable<Amimal>{

    public Double weight;
    public static void main(String[] args) {
        Amimal a = new Amimal();
    a.weight = 100.0;
    Amimal b = new Amimal();
    b.weight = 200.0;
    System.out.println(a.compareTo(b));
    }   
    
    

    @Override
    public int compareTo(Amimal o) {
        return Double.compare(this.weight,o.weight);
    }
    //compare to method works by this.(variable), o.variable

}
