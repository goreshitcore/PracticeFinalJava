public class Hamburger extends Food {

    protected int calories;

    public Hamburger(String description, int calories) {
        super(description);
        this.calories = calories;

    }

@Override
    public boolean isHealthy() {
        return false;
    }
    public static void main(String[] args) {
        Hamburger h = new Hamburger("ham",100);
        System.out.println(h.getDescription());
        System.out.println(h.calories);
        System.out.println(h.isHealthy());
    }
}
