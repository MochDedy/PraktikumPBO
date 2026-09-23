package id.ac.polinema.relasiclass.tugas;

public class ItemPesanan {
    private Produk produk;   // AGGREGATION: Produk dibuat di luar, diterima lewat constructor
    private int jumlah;

    public ItemPesanan(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public int hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }

    public String info() {
        return produk.getNama() + " x" + jumlah + " = Rp" + hitungSubtotal() + "\n";
    }
}
