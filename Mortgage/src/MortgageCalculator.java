import java.util.Scanner;

public class MortgageCalculator {

    private double amountOfLoan;
    private double monthlyInterestRate;

    private int totalNumberOfPayments;

    private final Scanner scanner;

    private final Input input;
    /**
     * Constructor of  class
     */
    public MortgageCalculator() {
        this.scanner = new Scanner(System.in);
        this.input = new Input();
    }

    /**
     * set the amount of loan
     * @param amountOfLoan , the amount of loan
     */
    public void setAmountOfLoan(double amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    /**
     * set the monthly interest rate
     * @param monthlyInterestRate , the monthly interest rate
     */
    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    /**
     * set the total number of payments
     * @param totalNumberOfPayments , the total number of payments
     */
    public void setTotalNumberOfPayments(int totalNumberOfPayments) {
        this.totalNumberOfPayments = totalNumberOfPayments;
    }

    /**
     * get the amount of loan from command line
     */
    public void enterAmountOfLoan() {

        System.out.println("Please enter the loan amount in dollars: ");
        this.input.inputForDouble(this.scanner);
        double amountOfLoan = this.input.getDoubleValue();
        setAmountOfLoan(amountOfLoan);
    }

    /**
     * get the monthly interest rate from command line
     */
    public void enterMonthlyInterestRate() {

        System.out.println("Please enter the annual interest rate as a percentage: ");
        this.input.inputForDouble(this.scanner);
        double annualInterestRate = this.input.getDoubleValue();
        double monthlyInterestRate = annualInterestRate/12/100;
        setMonthlyInterestRate(monthlyInterestRate);
    }

    /**
     *get the total number of payment
     */
    public void enterTotalNumberOfPayment() {

        System.out.println("Please enter the loan duration in years: ");
        this.input.inputForInteger(this.scanner);
        int years = this.input.getIntValue();
        int numberOfPayments = years * 12;
        setTotalNumberOfPayments(numberOfPayments);
    }

    /**
     * Calculation of monthly payment for Mortgage
     * @return , return the monthly payment for Mortgage
     */
    public double getMonthlyPayment() {

        return  this.amountOfLoan * this.monthlyInterestRate *
                Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) /
                (Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) - 1);
    }
}
