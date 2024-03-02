package SOLID.singleResponsibility;

import java.math.BigDecimal;


class TransactionOperation{
    // This is good example as it does only Transaction related operations
    public void deposit(BigDecimal amount, int accountNumber){
        // Getting Account details it is good job of account operations
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setAccountNumber(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }

}
public class Example2 {
}
