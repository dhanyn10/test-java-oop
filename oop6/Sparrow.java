package oop6;

import oop6.Flyable;

public class Sparrow extends Burung implements Flyable
{
    public Sparrow(int usia, String nama, String habitat)
    {
        super(usia, nama, habitat);
    }
    
    public void terbang()
    {
        System.out.println("Sparrow terbang tinggi");
    }
}