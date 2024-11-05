public class BankAccount123 {

protected int balance;
    public int getBalance() {
        return this.balance;
    }

    public BankAccount123() {
        this.balance = 0;
    }

public void deposit(int amount) {
    balance += amount;
}

public void withdraw (int amount) throws InsufficientFundsException {
    if ( balance < amount) {
        throw new InsufficientFundsException("withdraw: " + amount);
        }
    balance -= amount;

}
public static void main(String[] args)
	{
		BankAccount ba = new BankAccount();
        ba.deposit(1);
        try{
             ba.withdraw(2);
           }
           catch(InsufficientFundsException e)
           {
             System.out.println("Insufficient Funds: "+e.getMessage());
           }
	}

}
