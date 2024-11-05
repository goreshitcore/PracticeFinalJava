public class BankAccount2 implements Comparable <BankAccount> {

	public String name;
	
	public Integer balance;

	public int compareTo(BankAccount o)
    {
        return this.name.compareTo(o.name);
        //return this.balance.compareTo(o.balance);

        //returns lexicographically ordered compared to o.name and this.name
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.balance = 100;
        BankAccount b2 = new BankAccount();
        b2.balance = -1234;
        System.out.println(b1.compareTo(b2));
    }
    
}
