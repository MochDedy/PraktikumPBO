package id.ac.polinema.relasiclass.tugas;

public class Pesanan {
    private String kode;
    private Pelanggan pelanggan;      // AGGREGATION: dibuat di luar, di-inject lewat constructor
    private ItemPesanan[] arrayItem;  // COMPOSITION: ItemPesanan dibuat sendiri oleh Pesanan
    private int jumlahItem;

    public Pesanan(String kode, Pelanggan pelanggan, int kapasitas) {
        this.kode = kode;
        this.pelanggan = pelanggan;
        this.arrayItem = new ItemPesanan[kapasitas];
        this.jumlahItem = 0;
    }

    // Tidak ada parameter/setter bertipe ItemPesanan: new ItemPesanan(...) dipanggil di dalam Pesanan
    public boolean tambahItem(Produk produk, int jumlah) {
        if (jumlahItem >= arrayItem.length) {
            return false; // guard clause: keranjang penuh
        }
        arrayItem[jumlahItem] = new ItemPesanan(produk, jumlah);
        jumlahItem++;
        return true;
    }

    public int hitungTotal() {
        int total = 0;
        for (int i = 0; i < jumlahItem; i++) {
            total += arrayItem[i].hitungSubtotal();
        }
        return total;
    }

    // DEPENDENCY: MetodePembayaran hanya lewat parameter, tidak disimpan sebagai atribut
    public void bayar(MetodePembayaran metode) {
        if (jumlahItem == 0) {
            System.out.println("Pesanan kosong, tidak ada yang dibayar.");
            return;
        }
        metode.proses(hitungTotal());
    }

    public String info() {
        String info = "Kode Pesanan: " + kode + "\n";
        info += pelanggan.info();
        for (int i = 0; i < jumlahItem; i++) {
            info += arrayItem[i].info();
        }
        info += "Total: Rp" + hitungTotal() + "\n";
        return info;
    }
}
