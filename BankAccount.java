    public class BankAccount
        {
        protected int balance;

        public BankAccount()
        {
            this.balance = 100;
        }
    
    /*
        public int getBalance()
        {
            return this.balance;
        }
        
     * 
     */
        public void deposit(int amount)
        {
            this.balance += amount;
        }

        public void withdraw(int amount)
        {
            this.balance -= amount;
        }
    
        /*
         * public void withdraw(int amount)  throws InsufficientFundsException
        {
            if ( balance < amount ) {
                throw new InsufficientFundsException("withdraw: " + amount);
            }
                this.balance -= amount;

            }

        
         * 
         * 
         * 
         * 
         */
        //This method throws an InsufficientFundsException exception
        
    
        
 
        
    }

