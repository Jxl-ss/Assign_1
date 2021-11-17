import java.util.Scanner;

/**
 * A program that converts an octal number to decimal
 * @author  Jia Xuan Li
 * @version 1.0
 * @since   2021-09-08
 */
public class NumberConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // request for the 4-digit octal number
        System.out.print("Please enter a 4-digits Octal number: ");
        String octalNumber = myScanner.nextLine();

        // use an initial value for decimal conversion
        int toDecimal = 0;

        for (int i = 0; i < octalNumber.length(); i++) {
            int importance = (int) Math.pow(8, i);

            // get the value at the position i (3 - 1 to reverse the order)
            // then convert the char to an integer
            char charAtPosition = octalNumber.charAt(3 - i); 
            int numericValue = Character.getNumericValue(charAtPosition); 

            // add the digit value to the sum
            toDecimal += numericValue * importance;
        }

        // display the output
        System.out.printf("%-30s: %s%n%-30s: %d",
            "Octal Number", octalNumber,
            "Decimal Number", toDecimal
        );

        // exit
        myScanner.close();
        System.exit(0);
    }
}
