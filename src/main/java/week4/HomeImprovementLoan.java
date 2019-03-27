package week4;

public class HomeImprovementLoan extends Loan {

    public double improvLoan() {
        double homeImpro = getAmountOfLoan() * getLoanInYears() * getInterest();
        return homeImpro + getAmountOfLoan();
    }
}

