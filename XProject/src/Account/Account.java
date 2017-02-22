package Account;

/**
 * Created by jchen on 17/02/17.
 */
public class Account {
    public String owner;
    public long balance;

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOnwer() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }
}
