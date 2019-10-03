package basicjava;

import java.util.Scanner;

public class MethodsPractice {
    public static void main(String[] args) {

        //Using static method (Math Library) (Class Name)
        int x = (int) Math.sqrt(25);
        System.out.println("Sqrt of 25 is " + x);

        //Using non-static methods (Scanner and Strings) (Objects)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        str = str.toLowerCase();
        System.out.println("You have entered " + str);

    }
}
