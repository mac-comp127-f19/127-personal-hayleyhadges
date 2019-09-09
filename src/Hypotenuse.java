import java.util.Scanner;

public class Hypotenuse {

    public static double calculateHypotenuse(double length1, double length2) {
        return Math.sqrt((length1*length1)+(length2*length2));
    }

    public static void main(String [] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter a number for the first side: ");
        double x = scan.nextDouble();

        System.out.println("Enter a number for the other side: ");
        double y = scan.nextDouble();
        double z = calculateHypotenuse(x,y);
        System.out.println(z);






    }
}
