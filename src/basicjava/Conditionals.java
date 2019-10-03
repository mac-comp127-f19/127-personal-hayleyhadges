package basicjava;

import java.util.Scanner;

public class Conditionals {

    public static int squareNumber(int square) {
        return square * square;
    }

    public static boolean greaterThanTen(int z) {

        if (z <= 10) {
            return false;
        } else{
            return true;
        }
    }

    public static void main (String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int x = scan.nextInt();

        int y = squareNumber(x);

        System.out.println(y);

        System.out.println(greaterThanTen(y));





    }
}
