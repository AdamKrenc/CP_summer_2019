package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) throws NotEnoughMoneyException, NonExistingAccountException, InvalidAmountException {
        Bank bank = new Bank("MyBank");
        Customer c1 = bank.newCustomer("John", "Wick", "john@wick.com");
        Customer c2 = bank.newCustomer("Anne", "Brown", "anne@brown.com");

        Account a1 = bank.newCheckingAccount(c1, "EUR");
        Account a2 = bank.newSavingsAccount(c1, "EUR");

        Account a3 = bank.newCheckingAccount(c2, "EUR");
        Account a4 = bank.newSavingsAccount(c2, "EUR");


        try{
        a2.deposit(-500.0);
        a2.charge(233.2);
        a3.deposit(202.2);}

        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

        try{
        bank.transfer(1001, 1000, 0);
        System.out.println(bank);}

        catch (InvalidAmountException e){
        System.out.println(e.getMessage());
        } catch (NonExistingAccountException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

        try{
            bank.transfer(1000, 1001, 50);
            System.out.println(bank);}

        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        } catch (NonExistingAccountException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

        try{
            bank.transfer(1001, 1000, -50);
            System.out.println(bank);}

        catch (InvalidAmountException e){
            System.out.println(e.getMessage());
        } catch (NonExistingAccountException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }


      /*  BigDecimal b = new BigDecimal(1330);
        BigDecimal c = BigDecimal.valueOf(456.5);
        b = b.add(c);
        System.out.println(b);
        */
    }
}
