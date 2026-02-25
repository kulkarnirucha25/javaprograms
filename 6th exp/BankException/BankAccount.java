public class BankAccount {

    double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    void balanceEnquiry(){
        System.out.println("Current Balance = " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {

        if(amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");

        balance = balance + amount;

        System.out.println("Amount Deposited = " + amount);
    }

    void withdraw(double amount)
    throws LowBalanceException, NegativeNumberException{

        if(amount < 0)
            throw new NegativeNumberException("Negative amount not allowed");

        if(amount > balance)
            throw new LowBalanceException("Insufficient Balance");

        balance = balance - amount;

        System.out.println("Amount Withdrawn = " + amount);
    }

}