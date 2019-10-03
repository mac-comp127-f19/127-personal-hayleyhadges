/***
 * A class for manipulating strings so that they are properly emphatic.
 *
 * @author Abigail Marsh, Fall 2019
 */

package stringPractice;

import java.util.Scanner;

public class MakeEmphatic {

    /***
     * A method that takes in a string, and returns the emphasized version of that string.
     * Emphasized strings should be in ALL CAPS and use TOO MANY EXCLAMATION POINTS!!!
     *
     *
     * @param input Any string
     * @return The input string, in ALL CAPS!!!
     */
    public static String makeEmphatic(String input) {
        //Scanner scan = new Scanner(System.in);
       // System.out.println("Enter a string ");
       // String str = scan.nextLine();
        input = input.toUpperCase();
        input= input + "!!!";
        //System.out.println(str);
        return input;
    }

    /***
     * Run this program to test your method on different input strings
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter something you would like to emphasize: ");

        String input = scan.next();

        System.out.println(makeEmphatic(input));
    }
}
