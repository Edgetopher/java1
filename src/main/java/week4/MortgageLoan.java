package week4;

public class MortgageLoan extends Loan {
    public double mortgageLoan(){
        double mort = getAmountOfLoan() * getLoanInYears() * getInterest();
        return mort + getAmountOfLoan();
    }
}
