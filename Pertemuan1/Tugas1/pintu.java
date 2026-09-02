package Pertemuan1.Tugas1;

public class pintu {
    String warna;
    double tinggi;

    public pintu(String warna, double tinggi) {
        this.warna = warna;
        this.tinggi = tinggi;
    }

    public void buka() {
        System.out.println("Pintu dibuka.");
    }

    public void tutup() {
        System.out.println("Pintu ditutup.");
    }

    public void cetakInformasi() {
        System.out.println("=== INFORMASI PINTU ===");
        System.out.println("Warna           : " + warna);
        System.out.println("Tinggi          : " + tinggi + " cm");
    }
}
