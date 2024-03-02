package SOLID.singleResponsibility;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/***
 * Single Responsibility
 */

class Account{
    private BigDecimal accountNumber;
    private String firstName;
    private BigDecimal totalAmount;

    public BigDecimal getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigDecimal accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}


class AccountOperation {
    private static Map<BigDecimal,Account>accountMap = new HashMap<>();

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }

    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }

    /**
     * This method should not be the part of the AccountOperations
     * Reason is account operations are responsible for doing operations for
     * account like addAccount, updateAccount, getAccount and Find Account
     *
     * Adding this method violates the Single Responsibility principle \
     * Create the new class which actually does TransactionOperations
     */
    public void deposite(int amount, int accountNumber){
        // Move this method to different class
        // Check out example-2
    }

}


public class Example1 {
    public static void main(String[] args){

    }
}
