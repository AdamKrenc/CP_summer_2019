package pl.waw.sgh.bank;


public class NotEnoughMoneyException extends BankException {
    public NotEnoughMoneyException(String s) {
        super(s);
    }
}