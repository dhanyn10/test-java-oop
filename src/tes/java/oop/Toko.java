/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.java.oop;

/**
 *
 * @author dhanyn10
 */
public class Toko {
    
    public static void main(String[] args) {
        Pelanggan john;
        
        john = new Pelanggan();
        john.nama = "John Dewantara";
        john.usia = 48;
        john.tinggi = 180;
        john.perkenalan();
    }
}
