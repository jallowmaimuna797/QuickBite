public class Main {
    public static void main(String[] args) {

        // QuickBite Munchee Bus

        // Store menu items using parallel arrays
        String[] itemName = {"Munchee Biscuits", "Bananas", "Diary Chocolate"};
        double[] itemPrice = {15.00, 100.00, 250.00};
        boolean[] itemAvailable = {true, false, true};

        // Print the menu items
        for (int i = 0; i < itemName.length; i++) {

            // Check if the item is available or sold out
            String check = null;

            if (itemAvailable[i] == true) {
                check = "Available";
            } else {
                check = "Sold out";
            }

            System.out.println(itemName[i] + "\t" + itemPrice[i] + "\t" + check);
        }
    }
}