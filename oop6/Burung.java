package oop6;

public class Burung extends Hewan{

    public Burung(int usia, String nama, String habitat) {
        super(usia, nama, habitat);
    }

    @Override
    public void move()
    {
        System.out.println("Flapping wings");
    }
}
