package Pertemuan1.Tugas1;

public class meja {
    String warna;
    double panjang;

    public meja(String warna, double panjang) {
        this.warna = warna;
        this.panjang = panjang;
    }

    public void taruhBarang(String namaBarang) {
        System.out.println(namaBarang + " diletakkan di atas meja.");
    }

    public void lap() {
        System.out.println("Meja dilap hingga bersih.");
    }

    public void cetakInformasi() {
        System.out.println("=== INFORMASI MEJA ===");
        System.out.println("Warna           : " + warna);
        System.out.println("Panjang         : " + panjang + " cm");
    }
}
