package comp127;

import java.util.Scanner;

public class SentinelDrills {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int y = scan.nextInt();
        while (y>=0) {
            System.out.println("Enter a positive number: ");
            System.out.println(isOdd(y));
            y = scan.nextInt();
        }}


    public static boolean isOdd(int z) {

        return z % 2 != 0;
    }


}