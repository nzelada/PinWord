package NickZelada;

import java.util.Scanner;

/**
 * Converts a numeric pin to an equivalent word using the digit to letter
 * mapping on a standard telephone keypad.
 *
 * @author Nick Zelada
 * @version 03/28/2019 I affirm that this program is entirely my own work and
 * other person's work is involved.
 */
public class PinWordEnumerator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n", num);
        enumerateWords(num);
    }

    /**
     * A wrapper for a recursive method that enumerates all the phone keypad
     * encodings for a number.
     *
     * @param n a string representing the number
     */
    public static void enumerateWords(String lettering) {
        // Implement a recursive method that generates
        // all possible phone keypad encodings for a 
        // number. Implement additional auxiliary methods
        // if necessary.

        if (lettering != null) { // if not isn't nothing then it calls the other method
            enumerateWords(lettering, ""); // if not null, it calls this.
        }

    }

    /**
     *
     * @param n the digit of the pin
     * @return returns a letter that goes with it
     */
    static char[] getKeys(int n) {

        switch (n) { // the number for the switch

            case 0:

                return new char[]{' '}; // 0

            case 1:

                return new char[]{'.'}; // 1

            case 2:

                return new char[]{'A', 'B', 'C'}; // 2

            case 3:

                return new char[]{'D', 'E', 'F'}; //3

            case 4:

                return new char[]{'G', 'H', 'I'}; // 4

            case 5:

                return new char[]{'J', 'K', 'L'}; // 5

            case 6:

                return new char[]{'M', 'N', 'O'}; // 6

            case 7:

                return new char[]{'P', 'Q', 'R', 'S'}; // 7

            case 8:

                return new char[]{'T', 'U', 'V'}; // 8

            case 9:

                return new char[]{'W', 'X', 'Y', 'Z'}; // 9

        }

        return null; // if nothing return null

    }

    /**
     *
     * @param num the number of the string
     * @param text the letter that belongs to the number
     */
    static void enumerateWords(String n, String text) {

        if (n.length() == 0) { // base case

            System.out.println(text); // prints

        } else {

            int digit = n.charAt(0) - '0'; // finds digit at 0

            char letters[] = getKeys(digit); // finds the letters for digit

            if (letters != null) { // if not null then do this

                for (int i = 0; i < letters.length; i++) { /* for loop 
                     for all letters*/

                    enumerateWords(n.substring(1), text + letters[i]); /*
                     only prints one letter of the string
                     */

                }

            }

        }

    }

}
