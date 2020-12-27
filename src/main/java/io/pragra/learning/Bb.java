package io.pragra.learning;

public class Bb extends Aa {
    private int id;

    public Bb(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public void employee(){
        System.out.println(id);
    }

    public static void main(String[] args) {
        Aa aa = new Bb("keerthi",28,69);
        ((Bb) aa).employee();
    }
}
