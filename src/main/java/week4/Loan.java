package week4;

public class Loan {
    private double interest;
    private int loanInYears;
    private int amountOfLoan;

    public void setInterest(double interest){
        this.interest = interest;
    }
    public double getInterest() {
        return interest;
    }
    public void setLoanInYears(int loanInYears){
        this.loanInYears = loanInYears;
    }
    public int getLoanInYears(){
        return loanInYears;
    }
    public void setAmountOfLoan(int amountOfLoan){
        this.amountOfLoan = amountOfLoan;
    }
    public int getAmountOfLoan(){
        return amountOfLoan;
    }
}
