package comp127.Interface;

import java.util.ArrayList;
import java.util.List;

public class InheretanceMain {

    public static void main(String[] args){
        Wolf w = new Wolf("grey",4);
        Dog d = new Dog("black");


        System.out.println("Dog says: " + d.getNoise());
        System.out.println("Wolf says: " + w.getNoise());

        Animal al = new Dog("red");
        System.out.println("Animal says: " + al.getNoise());

        List<Animal> animals = new ArrayList<>();
        animals.add(w);
        animals.add(d);
        animals.add(al);

        for (Animal a : animals){
            System.out.println(a.getNoise());
        }

        List<Canine> canines = new ArrayList<>();
        canines.add(w);
        canines.add(d);

        for(Canine c : canines){
            System.out.println("Canine color: " + c.getColor());
        }
    }
}
