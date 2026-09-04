package Pertemuan2.Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.kode = "B001";
        b1.namaBarang = "Keyboard Mekanik";
        b1.hargaDasar = 500000;
        b1.diskon = 0.1f; // 10%

        b1.tampilData();
    }
}
