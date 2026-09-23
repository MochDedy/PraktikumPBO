package id.ac.polinema.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Pelanggan pelanggan = new Pelanggan("Jane Doe", "jane@mail.com");
        Produk buku = new Produk("Buku Java", 85000);
        Produk mouse = new Produk("Mouse Wireless", 120000);

        Pesanan pesanan = new Pesanan("PSN-001", pelanggan, 5);
        pesanan.tambahItem(buku, 2);
        pesanan.tambahItem(mouse, 1);
        System.out.println(pesanan.info());

        MetodePembayaran qris = new MetodePembayaran("QRIS");
        pesanan.bayar(qris);
    }
}
