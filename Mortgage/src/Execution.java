import java.util.Scanner;

public class Execution {

    /**
     * Execution of a main function
     * @param args , a parameter of main function
     */
    public static void main(String[] args) {

        MortgageCalculator mortgageCalculator = new MortgageCalculator();

        System.out.println("Welcome in Mortgage Calculator");
        mortgageCalculator.enterAmountOfLoan();
        mortgageCalculator.enterMonthlyInterestRate();
        mortgageCalculator.enterTotalNumberOfPayment();
        double monthlyPayment = mortgageCalculator.getMonthlyPayment();

        System.out.println("The monthly payment is " + monthlyPayment);
    }
}


