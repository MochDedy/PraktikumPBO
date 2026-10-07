package Pertemuan6.Tugas;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan,
            int hargaDasar, String maskapai, int beratBagasi,
            String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();
        System.out.println("Nomor Paspor   = " + nomorPaspor);
        System.out.println("Asuransi       = " + asuransi);
        // DIUBAH: hargaDasar -> getHargaDasar()
        System.out.println("Total Bayar    = " + (getHargaDasar() + hitungBiayaBagasi() + asuransi));
    }
}
