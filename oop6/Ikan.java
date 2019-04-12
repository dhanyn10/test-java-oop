package oop6;

import oop6.Hewan;

public class Ikan extends Hewan
{
    public Ikan(int usia, String nama, String habitat)
    {
        super(usia, nama, habitat);
    }

    public void renang()
    {
        System.out.println("berenang");
    }

    public void move()
    {
        System.out.println("ikan berenang");
    }
}