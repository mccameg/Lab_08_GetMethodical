
import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        int numDays = 0;

        birthYear = SafeInput.getRangedInt(in, "Enter the year that you were born", 1950, 2010); // calls the SafeInput method getRangedInt and prompt user to enter year they were born. Includes range 1950-2010
        birthMonth = SafeInput.getRangedInt(in, "Enter the month that you were born", 1, 12); // calls the SafeInput method getRangedInt and prompt user to enter month they were born. Includes range 1-12

        switch (birthMonth) // switch selector based on what birth month is entered
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // months with 31 days
            numDays = 31; // sets numDays to 31. this will be the upper limit of day range
            break;

            case 4: case 6: case 9: case 11: // months with 30 days
            numDays = 30; // sets numDays to 30. this will be the upper limit of day range
            break;

            case 2: // February has 28 days or 29 on a leap year
                if (birthYear % 4 == 0) // if the year is divisible by 4 with no remainder, it is a leap year (there are other rules that factor into leap year calculation, but not within our range of 1950-2010)
                    numDays = 29; // sets numDays to 29. this will be the upper limit of day range
                else // not a leap year, February has 28 days
                    numDays = 28; // sets numDays to 28. this will be the upper limit of day range
                break;
        }

        birthDay= SafeInput.getRangedInt(in, "Enter the day of the month that you were born", 1, numDays); // calls the method and prompts user to enter day they were born. Range is 1-numDays. numDays changes based on the month entered


        birthHour = SafeInput.getRangedInt(in, "Enter the hour that you were born", 0, 24); // calls the method and prompts user to enter hour they were born 0-24
        birthMinute = SafeInput.getRangedInt(in, "Enter the minute that you were born", 0, 59); // calls the method and prompts the user to enter minute they were born 0-59

        System.out.println("You were born on " + birthMonth + " " +  birthDay + " " + birthYear + " at " + birthHour + " hours and " + birthMinute + " minute(s)."); // output to echo back all information that was entered

    }
}
