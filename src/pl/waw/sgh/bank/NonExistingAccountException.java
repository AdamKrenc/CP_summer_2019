package pl.waw.sgh.bank;

public class NonExistingAccountException extends BankException {
    public NonExistingAccountException(String s) {
        super(s);
    }
}


