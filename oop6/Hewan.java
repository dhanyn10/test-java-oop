package oop6;

public abstract class Hewan {
    int usia;
    String nama;
    String habitat;

    public Hewan(int usia, String nama, String habitat) {
        this.usia = usia;
        this.nama = nama;
        this.habitat = habitat;
    }
    
    public void berlari()
    {
        System.out.println("berlari...");
    }

    public abstract void move();
}
