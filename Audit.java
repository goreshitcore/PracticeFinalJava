public class Audit extends BankAccount{
    private int depositCount, withdrawCount;
    public Audit() {
        super();
        this.depositCount = 0;
        this.withdrawCount = 0;
    }
@Override
    public void deposit(int amount) {
        super.deposit(amount);  
        if ( amount > 0 ) {
            depositCount++;
        }
    }
@Override
    public void withdraw(int amount) {
        super.withdraw(amount); 
        if (amount > 0) {
            withdrawCount++;
        }

    }
    @Override
    public String toString()  {
        return "depositCount = " +depositCount + "\nwithdrawCount = " +withdrawCount;

    }

    public static void main(String[] args) {
        Audit audit = new Audit();
        audit.withdraw(100);
        audit.deposit(40);
        System.out.println(audit.balance);
        System.out.println(audit);
    }
 
    
}
