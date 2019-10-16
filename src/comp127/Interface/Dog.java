package comp127.Interface;

public class Dog extends Canine implements Animal{

    private String noise = "bark bark";

    public Dog(String color) {
        super(color);
    }


    @Override
    public String getNoise() {
        return this.noise;
    }
}
