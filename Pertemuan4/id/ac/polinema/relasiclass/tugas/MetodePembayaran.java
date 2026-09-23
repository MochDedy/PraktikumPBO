package id.ac.polinema.relasiclass.tugas;

public class MetodePembayaran {
    private String nama;

    public MetodePembayaran(String nama) {
        this.nama = nama;
    }

    public void proses(int nominal) {
        System.out.println("[" + nama + "] Memproses pembayaran Rp" + nominal + "...");
        System.out.println("[" + nama + "] Pembayaran berhasil.");
    }
}
