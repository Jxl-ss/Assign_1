import java.util.Scanner;

/**
 * A program that requests for your info, and then displays it
 * @author  Jia Xuan Li
 * @version 1.0
 * @since   2021-09-08
 */
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // ask for the name
        System.out.print("Please enter your name: ");
        String myName = myScanner.nextLine();

        // ask for the age
        System.out.print("Please enter your age: ");
        int myAge = myScanner.nextInt();

        // we need this to get rid of the line break,
        // so it doesn't skip the gender prompt
        myScanner.nextLine();

        // ask for the gender
        System.out.print("Please enter your gender: ");
        String myGender = myScanner.nextLine();

        // ask for the department
        System.out.print("Please enter your department: ");
        String myDepartment = myScanner.nextLine();

        // ask for the value of PI
        System.out.print("Please enter the value of PI (3.1415926): ");
        double pi = myScanner.nextDouble();

        // skip a line to make it cleaner
        System.out.println("");

        // type is aligned with the value, for readability
        System.out.printf("%-30s: %s%n%-30s: %d%n%-30s: %s%n%-30s: %s%n%-30s: %.2f",
            "Name", myName,
            "Age", myAge,
            "Gender", myGender,
            "Department", myDepartment,
            "PI", pi
        );

        // exit
        myScanner.close();
        System.exit(0);
    }
}
