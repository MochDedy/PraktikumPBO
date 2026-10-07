package Pertemuan6.Tugas;

public class Tiket {
    protected String kodeTiket;
    protected String namaPenumpang;
    protected String asal;
    protected String tujuan;
    private int hargaDasar; // DIUBAH: protected -> private

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    // Menambahkan: getter agar subclass & class lain bisa membaca hargaDasar
    public int getHargaDasar() {
        return hargaDasar;
    }

    // Menambahkan: setter agar subclass & class lain bisa mengisi hargaDasar
    public void setHargaDasar(int hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.println("Kode Tiket     = " + kodeTiket);
        System.out.println("Nama Penumpang = " + namaPenumpang);
        System.out.println("Rute           = " + asal + " - " + tujuan);
        System.out.println("Harga Dasar    = " + hargaDasar); // tetap aman: masih di dalam class Tiket
    }
}
