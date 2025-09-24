 import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        // Pseudo: Prompt for D, R, or I. Cascade if/else to print the correct response; Other for anything else.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party affiliation (D, R, or I): ");
        String choice = in.nextLine();

        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other.");
        }
    }
}
