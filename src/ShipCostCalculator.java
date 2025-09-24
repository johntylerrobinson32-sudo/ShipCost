import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Pseudo: Ask user for item price; if price >= 100 shipping = 0 else shipping = 2% price; print shipping & total
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shipping = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the item price: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();
            if (price >= 100) {
                shipping = 0.0;
            } else {
                shipping = price * 0.02;
            }
            total = price + shipping;
            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total cost: $" + total);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid entry: " + trash);
            System.out.println("Run program again and enter a valid number.");
        }
    }
}
