import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Pseudo: Ask user for month (1-12). If in range echo, else show error with the entered value.
        Scanner in = new Scanner(System.in);
        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run program again with a number 1-12.");
        }
    }
}
