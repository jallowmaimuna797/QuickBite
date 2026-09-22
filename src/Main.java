import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // QuickBite Munchee Bus

        // Create Scanner object
        Scanner in = new Scanner(System.in);

        // Store menu items using parallel arrays
        String[] itemName = {"Munchee Biscuits", "Bananas", "Diary Chocolate"};
        double[] itemPrice = {15.00, 100.00, 250.00};
        boolean[] itemAvailable = {true, false, true};

        // Add new items using the keyboard
        do {
            System.out.println("Are you adding item: Y or N?");

            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println("Enter item name:");
            String name = in.next();

            System.out.println("Enter item price:");
            double price = in.nextDouble();

            System.out.println("Enter item status:");
            boolean status = in.nextBoolean();

            // Resize itemName array and add the new item
            itemName = Arrays.copyOf(itemName, itemName.length + 1);
            itemName[itemName.length - 1] = name;

            // Resize itemPrice array and add the new price
            itemPrice = Arrays.copyOf(itemPrice, itemPrice.length + 1);
            itemPrice[itemPrice.length - 1] = price;

            // Resize itemAvailable array and add the new status
            itemAvailable = Arrays.copyOf(itemAvailable, itemAvailable.length + 1);
            itemAvailable[itemAvailable.length - 1] = status;

        } while (true);

        // Print the menu
        for (int i = 0; i < itemName.length; i++) {

            String check;

            if (itemAvailable[i] == true) {
                check = "Available";
            } else {
                check = "Sold out";
            }

            System.out.println(itemName[i] + "\t" + itemPrice[i] + "\t" + check);


        }
        // Linear search by item name
        System.out.println("Enter the item name to search:");
        String searchTerm = in.next();

        boolean found = false;

        for (int i = 0; i < itemName.length; i++) {

            if (itemName[i].equalsIgnoreCase(searchTerm)) {

                System.out.println("Item found!");
                System.out.println("Name: " + itemName[i]);
                System.out.println("Price: " + itemPrice[i]);
                System.out.println("Available: " + itemAvailable[i]);

                found = true;
            }
        }

        if (!found) {
            System.out.println(searchTerm + " not found.");
        }
    }
}