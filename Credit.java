public class Credit extends BankAccount{
    private double rate;
    public Credit(double rate) {
        this.rate = rate;
    }
    public double  interest() {
        if ( balance <= 0) {
            return Math.abs(rate * balance);
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Credit cc = new Credit(1.0);
        cc.withdraw(150);
        System.out.println(cc.interest());
    }

}
