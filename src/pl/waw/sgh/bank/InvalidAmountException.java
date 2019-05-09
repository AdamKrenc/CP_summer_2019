package pl.waw.sgh.bank;

public class InvalidAmountException extends BankException {
    public InvalidAmountException(String s) {
        super(s);
    }
}
