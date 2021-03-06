package pl.waw.sgh.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastName, String email) {
        Customer cust = new Customer(lastCustID++, firstName, lastName, email);
        customerList.add(cust);
        return cust;
    }

    public Account newAccount(Customer customer, String currency, boolean isChecking) {
        Account acc = isChecking ?
                new CheckingAccount(lastAccID++, currency, customer)
                : new SavingsAccount(lastAccID, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newCheckingAccount(Customer customer, String currency) {
        return newAccount(customer, currency, true);
    }

    public Account newSavingsAccount(Customer customer, String currency) {
        return newAccount(customer, currency, false);
    }

    public Account findAccountByID(Integer accID) throws NonExistingAccountException{
        for (Account acc : accountList) {
            if (acc.getAccountID().equals(accID))
                return acc;
        }
        throw new NonExistingAccountException("Account id: " + accID + " does not exist!");

    }

    public void transfer(Integer fromAccID, Integer toAccID, double toTransfer) throws NotEnoughMoneyException, NonExistingAccountException, InvalidAmountException {
        transfer(findAccountByID(fromAccID), findAccountByID(toAccID), toTransfer);
        if (toTransfer<0)
            throw new InvalidAmountException("The amount of money (" + toTransfer + ") You tried to transfer from Account " + fromAccID +
                    " to Account " + toAccID + " IS INVALID!");
    }


    public void transfer(Account fromAcc, Account toAcc, double toTransfer) throws NotEnoughMoneyException, InvalidAmountException {
        fromAcc.charge(toTransfer);
        toAcc.deposit(toTransfer);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "'" + name + '\'' +
                "\ncusts=" + customerList +
                "\naccos=" + accountList +
                '}';
    }
}
