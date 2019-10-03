package comp127;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListStyles {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("these", "here", "are", "some", "words"));


        //for each loop
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();


        //C-style for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        //while loops

        int j = 0;
        while (j < 4) {
            System.out.println("Hi!");
            j++;

        }

        int h = 0;
        while (h >= 0) {
            System.out.println("Enter a number!");
            Scanner scan = new Scanner(System.in);
            h = scan.nextInt();
        }

        Iterator<String> itr = words.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        Iterator<String> itr2 = words.iterator();
        while (itr2.hasNext()) {
            itr2.next();
            itr2.remove();
        }
        System.out.println(words.toString());
    }
}