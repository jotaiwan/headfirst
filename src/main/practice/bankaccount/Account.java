package practice.bankaccount;

/**
 * Created by jotaiwan on 24/02/2017.
 */
public class Account {
    public String owner;
    public String type;
    public long balance;

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public String getOwner() {
        return owner;
    }

    public String getType() {
        return type;
    }

    public long getBalance() {
        return balance;
    }
}
