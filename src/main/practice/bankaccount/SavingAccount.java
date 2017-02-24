package practice.bankaccount;

/**
 * Created by jotaiwan on 24/02/2017.
 */
public class SavingAccount extends Account {
    public SavingAccount(String name, long amount) {
        super(name, amount);
        System.out.println(name + " account is generated with amount: " + amount + "\n");
    }

    public SavingAccount(long amount) {
        super("saving", amount);
        System.out.println("Saving account is generated with amount: " + amount + "\n");
    }
}
