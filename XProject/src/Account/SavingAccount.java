package Account;

/**
 * Created by jchen on 17/02/17.
 */
public class SavingAccount extends Account {


    public SavingAccount(String owner, long balance) {
        super(owner, balance);
        System.out.println("");
    }

    public void deposit(long amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + ", Total balance: " + getBalance());
    }
}
