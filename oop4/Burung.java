package oop4;

public class Burung extends Hewan{

    public Burung(int usia, String nama, String habitat) {
        super(usia, nama, habitat);
    }
    public void terbang()
    {
        System.out.println("terbang ke langit");
    }
}
