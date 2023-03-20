import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double totalCost = 0;
        boolean moreItems = true;

        while(moreItems == true) // program loops until moreItems is false
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the cost of your item", .50, 9.99); // calls SafeInput method getRangedDouble with range .50-9.99
            totalCost = totalCost + itemPrice; // calculates total cost to give a running total
            System.out.printf("The total cost is $" + "%.2f\n", totalCost); // outputs total cost with two decimal places
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to enter?"); // calls SafeInput method getYNConfirm. User inputs Y or N to say if they have more items to enter. If they do, program continues to loop since moreItems is true. When user enters N, moreItems becomes false and program ends.
        }





    }
}
