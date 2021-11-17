import java.util.Scanner;

/**
 * A program that calculates your balance after a certain amount of years
 * with your initial balance, the annual interest rate and the time in years
 * @author  Jia Xuan Li
 * @version 1.1
 * @since   2021-09-08
 */
public class BalanceCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // request for the initial balance
        System.out.print("Please enter the initial balance: ");
        double initialBalance = myScanner.nextDouble();

        // request for the annual interest
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double annualInterestRate = myScanner.nextDouble();

        // request for the year count
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        int savingYearCount = myScanner.nextInt();

        // calculate the final balance, using an exponential function
        double finalBalance = initialBalance * Math.pow(1 + annualInterestRate / 100, savingYearCount);
        
        // skip a line to make it cleaner
        System.out.println("");

        // display the output
        System.out.printf("%-30s: %10.2f%n%-30s: %9.2f%%%n%-30s: %10d%n%s%n%-30s: %10.2f",
            "Initial Balance", initialBalance,
            "Annual Interest Rate", annualInterestRate,
            "Saving Years", savingYearCount,
            "--------------------------------------",
            "Balance After " + String.valueOf(savingYearCount) + " Years", finalBalance
        );

        // exit
        myScanner.close();
        System.exit(0);
    }
}
