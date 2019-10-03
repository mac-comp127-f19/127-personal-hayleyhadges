package comp127;

import java.util.Scanner;

public class Random {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scan.nextInt();
        java.util.Random generator = new java.util.Random();
        int num1;
        float num2;
        num1 = generator.nextInt(x+1);
        System.out.println("From 0 to " + x  + ": " + num1);
    }
}
