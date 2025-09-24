import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Pseudo: Prompt age; if age >= 21 print "You get a wrist band." else do nothing.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String trash = "";
        int age = 0;

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
            // else do nothing
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again with a number.");
        }
    }
}
