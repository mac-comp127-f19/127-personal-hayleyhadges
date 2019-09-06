package basicjava;

public class BasicStuff {

    public static void main(String[] args) {
        double age0 = 19;
        double age1 = 20;
        System.out.println("We are " + age0 + " and " + age1 + " years old.");

        double sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges + "!");

        System.out.println("The sum of our ages is " + (age0 + age1) + "!");

        System.out.println((6/3));

        System.out.println((6.0 / 4.0));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println((Integer.MIN_VALUE) - 1);

        int hours = 1600;
        int days = hours/24;
        int rhours = hours%24;
        int weeks = days/7;
        int rdays = days%7;
        System.out.println("There are " + weeks + " weeks, " + rdays + " days, and " + rhours + " hours.");









    }
}
