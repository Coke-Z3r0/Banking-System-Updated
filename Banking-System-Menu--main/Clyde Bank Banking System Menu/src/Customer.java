import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Name: Customer.Java
 * Author:Lee McGuire Faud
 * Date: 11/2/2023
 * Description: This is the Class that Allows Users to set their Name in the bank.
 */
public class Customer {
    static Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String password;

    public Customer(String firstName, String lastName, String password) {//filling values for each item in the array
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Customer() {
        setCustomerDetails();//Set the customer details
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean verifyPassword(String inputPassword) {
        return password.equals(inputPassword);
    }//verifying password


    public void setCustomerDetails() {
        System.out.println("Registration:");
        System.out.print("First Name: ");
        validateString();//validating the string entered for the first name
        this.firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        this.lastName = scanner.nextLine();
        validateString();//validating the string for the Surname
        System.out.print("Password: ");
        this.password = scanner.nextLine();
    }

    public static String validateString() {
        while (true) {
            try {
                String myString = scanner.nextLine();
                return myString;
            } catch (InputMismatchException e) {
                //sc.nextLine();
                /*
                 * Same comment as above applies
                 */
                System.out.println(e.getMessage());
                System.out.print("That is not a valid String, please try again:");
            }
        }
    }
}
