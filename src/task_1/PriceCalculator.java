import java.util.Scanner;

/**
 * A program that calculates the cost after tax, with the initial price and the discount rate
 * @author  Jia Xuan Li
 * @version 1.0
 * @since   2021-09-08
 */
public class PriceCalculator {
    public static void main(String[] args) {
        // tax are constants
        final double FEDERAL_TAX_RATE = 0.05;
        final double PROVINCIAL_TAX_RATE = 0.09975;
        
        Scanner myScanner = new Scanner(System.in);

        // request for item price
        System.out.print("Please enter the item price: ");
        double itemPrice = myScanner.nextDouble();

        // request for discount ratio
        System.out.print("Please enter the discount ratio (5 for 5% off): ");
        double discountRatio = myScanner.nextDouble();

        // calculate before tax
        double priceBeforeTax = itemPrice * (1 - discountRatio / 100);

        // calculate taxes
        double federalTax = priceBeforeTax * FEDERAL_TAX_RATE;
        double provincialTax = priceBeforeTax * PROVINCIAL_TAX_RATE;

        // calculate final price by summing the price with the taxes
        double finalPrice = priceBeforeTax + federalTax + provincialTax;

        // skip a line to make the output cleaner
        System.out.println("");

        // display the output
        System.out.printf("%-30s: %.2f%n%-30s: %.2f%%%n%-30s: %.2f%n%s%n%-30s: %.2f%n%-30s: %.2f%n%-30s: %.2f", 
            "Original Price", itemPrice, 
            "Discount Ratio", discountRatio,
            "Price before tax", priceBeforeTax,
            "-------------------------------------",
            "Federal Tax", federalTax,
            "Provincial Tax", provincialTax,
            "Final Price", finalPrice
        );

        myScanner.close();
        System.exit(0);
    }
}

