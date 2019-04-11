package oop4;

public class Kebunbinatang {
    public static void main(String[] args) {
        Hewan h1 = new Hewan(11, "Kuda", "darat");
        h1.berlari();
        
        Burung b1 = new Burung(3, "Cendrawasih", "udara");
        /*
         *  method berlari hanya ada di class Hewan, 
         *  tapi pada class Burung melakukan extends terhadap class Hewan.
         *  sehingga class Burung dapat mengaplikasikan method berlari
         *  yang berasal dari class Hewan untuk dipanggil.
         */
        b1.berlari();
        b1.terbang();
    }
}
