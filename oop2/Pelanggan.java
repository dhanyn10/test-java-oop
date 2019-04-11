package oop2;

public class Pelanggan {
    
    String nama;
    int usia;
    int tinggi;
    
    public void perkenalan()
    {
        System.out.println("perkenalkan, nama saya adalah " + nama);
        System.out.println("usia mencapai " + usia + " dengan tinggi " + tinggi);
    }
    
    public Pelanggan()
    {
        nama    = "Arslan Senki";
        usia    = 18;
        tinggi  = 170;
    }
}
