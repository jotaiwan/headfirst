package practice.bankaccount;

/**
 * Created by jotaiwan on 24/02/2017.
 */
public class ChequeAccount extends Account {
    public ChequeAccount(String name, long amount) {
        super(name, amount);
    }

    public ChequeAccount(long amount) {
        super("Cheque", amount);
    }

}
