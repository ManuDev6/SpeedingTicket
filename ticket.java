// Import java.util

import java.util.Scanner;

public class ticket {

    // Main method

    public static void main(String[] args) {

        // Create scanner object

        Scanner scanner = new Scanner(System.in);

        // Enter speed

        System.out.println("Give speed: ");
        int speed = Integer.valueOf(scanner.nextLine());

        // Speed allert

        if (speed > 120) {

            System.out.println("Speeding ticket!");

        }
        else {

            System.out.println("Normal speed");

        }

    }

}