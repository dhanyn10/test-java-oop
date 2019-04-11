package oop5;

public class Ayam extends Burung
{

    public Ayam(int usia, String nama, String habitat)
    {
        super(usia, nama, habitat);
    }
    public void terbang()
    {
        System.out.println("gue gak bisa terbang");
    }
}