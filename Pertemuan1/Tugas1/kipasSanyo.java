package Pertemuan1.Tugas1;

public class kipasSanyo extends elektronik {
    int kecepatan; // level 1 - 5
    int dayaWatt;

    public kipasSanyo(String merek, int tahunProduksi, int kecepatan, int dayaWatt) {
        super(merek, tahunProduksi);
        this.kecepatan = kecepatan;
        this.dayaWatt = dayaWatt;
    }

    public void aturKecepatan() {
        System.out.println("Kecepatan kipas diatur ke level " + kecepatan + ".");
    }

    public void berhentiBerputar() {
        System.out.println("Kipas berhenti berputar.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== INFORMASI KIPAS ANGIN SANYO ===");
        super.cetakInformasi();
        System.out.println("Kecepatan       : " + kecepatan);
        System.out.println("Daya            : " + dayaWatt + " watt");
    }
}