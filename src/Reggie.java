import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // SSN
        String SSN = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}" ); // calls SafeInput method getRegExString and prompts user to input their SSN with the format 000-00-0000
        System.out.println("Your SSN is " + SSN); // output to echo back the valid input

        // m-Number
        String mNumber = "";

        mNumber = SafeInput.getRegExString(in, "\nEnter your UCID 'M' Number", "(M|m)\\d{5}"); // calls SafeInput method getRegExString and prompts user to input their m-Number with the format m00000
        System.out.println("Your UCID is " + mNumber); // output to echo back the valid input

        // menu choice
        String menuChoice = "";

        menuChoice = SafeInput.getRegExString(in, "\nEnter a menu choice O - Open S - Save V- View Q- Quit", "[OoSsVvQq]"); // calls SafeInput method getRegExString and prompts user to input a menu choice Oo,Ss,Vv, or Qq
            menuChoice = menuChoice.toUpperCase(); // translates input into upper case (in case it was entered in lower case)
        switch(menuChoice) // switch selector based on which menu option was entered
        {
            case "O":
                System.out.println("You chose Open"); // when O or o are entered, output tells user what they chose
            break;
            case "S":
                System.out.println("You chose Save"); // when S or s are entered, output tells user what they chose
            break;
            case "V":
                System.out.println("You chose View"); // when V or v are entered, output tells user what they chose
            break;
            case "Q":
                System.out.println("You chose Quit. Goodbye!"); // when Q or q are entered, output tells user what they chose and ends program
                System.exit(0); // exits program
            break;
        }



    }
}
