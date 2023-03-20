import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String firstName = "";
        String lastName = "";

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); // calls the SafeInput method getNonZeroLenString and prompt user to enter first name
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); // calls the SafeInput method getNonZeroLenString and prompt user to enter last name
        System.out.println("\nYour full name is: " + firstName + " " + lastName); // output to show what was entered
    }
}
