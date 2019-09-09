package comp127;

import java.util.Scanner;

public class OddEven {

    public static void main (int[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int x = scan.nextInt();

        System.out.println(isOdd(x));



    }

    public static boolean isOdd(int z) {

        if (z%2 == 0) {
            return false;
        } else{
            return true;
        }
    }
}
