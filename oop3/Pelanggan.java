package tes.java.oop3;

public class Pelanggan {
    String nama;
    int usia;
    int tinggi;
    
    public void identitas()
    {
        System.out.println("perkenalkan, nama saya adalah " + nama);
        System.out.println("usia mencapai " + usia + " dengan tinggi " + tinggi);
    }

    public Pelanggan(String nama, int usia, int tinggi) {
        this.nama = nama;
        this.usia = usia;
        this.tinggi = tinggi;
    }
    
}
