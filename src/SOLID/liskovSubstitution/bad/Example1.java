package SOLID.liskovSubstitution.bad;

// Liskov Subs Principle :

/**
 * Whenever you're creating the parent child relationship, both the class should be inter-changeable
 * and substitutable
 */


/**
 * This LoanPayment interface is responsible for payment related operations on loan account
 * LoanPayment interface implemented by actual loans like HomeLoan, Credit Card Loan etc.
 * For Credit card/Personal loan which is unsecured forecloseLoan and repayment() is not allowed
 */
interface LoanPayment{
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}

class HomeLoan implements  LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}

class CredCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("foreCloseLoan does not support in CredCard loan");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment is not allowed in CreditCard loan");
    }
}

/**
 * We are unable to substitute the subtype
 */
class LoanClosureService{
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment){
        this.loanPayment = loanPayment;
    }

    public void foreCloseLoan(){
        loanPayment.foreCloseLoan();
    }
}

public class Example1 {
}
