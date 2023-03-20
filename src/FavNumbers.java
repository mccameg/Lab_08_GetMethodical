import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInteger = 0;
        double favDouble = 0;

        favInteger = SafeInput.getInt(in, "Enter your favorite integer"); // calling the SafeInput method getInt and prompting the user to enter their favorite integer
        favDouble = SafeInput.getDouble(in, "Enter your favorite decimal number"); // calling the SafeInput method getDouble and prompting the user to enter a double
        System.out.println("Your favorite integer is " + favInteger + " and your favorite decimal number is " + favDouble); // output to echo the inputs back to the user
    }
}
