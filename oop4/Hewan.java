package oop4;

public class Hewan {
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
}
