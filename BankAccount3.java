import java.util.ArrayList;
import java.util.Collections;

public class BankAccount3 implements Comparable<BankAccount>
{
	protected Integer balance;
	
	public BankAccount3()
	{
		this.balance = 0;
	}
	
	@Override
	public String toString()
	{
		return "balance = "+this.balance;	
	}
	
	public void deposit(int amount)
	{
		this.balance += amount;
	}
	
	public void withdraw(int amount)
	{
		this.balance -= amount;
	}
	
	

	@Override
	public int compareTo(BankAccount arg0) 
	{	
		return this.balance.compareTo(arg0.balance);
	}

	public static void main(String[] args)
    {
        BankAccount3 acc1 = new BankAccount3();
        BankAccount3 acc2 = new BankAccount3();
        BankAccount3 acc3 = new BankAccount3();

        acc1.deposit(250);
        acc2.deposit(90);
        acc3.deposit(50);

        ArrayList<BankAccount3> accounts = new ArrayList<>();
        
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        
        Collections.sort(accounts);
        System.out.println(accounts);     


	}
	
}
