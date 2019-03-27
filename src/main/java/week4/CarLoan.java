package week4;

public class CarLoan extends Loan {
    public double carLoan(){
        return getInterest() * getAmountOfLoan() * getLoanInYears();
    }
}
