package oop1;

public class Runner{
    
    public static void main(String[] args) {
        
        Pelanggan john = new Pelanggan();
        john.nama = "John Dewantara";
        john.usia = 48;
        john.tinggi = 180;
        john.perkenalan();
        
        Pelanggan kirito = new Pelanggan();
        kirito.nama = "Kirigaya Kazuto";
        kirito.usia = 20;
        kirito.tinggi = 170;
        kirito.perkenalan();
    }
}
