package id.ac.polinema.relasiclass.percobaan5;

// File eksperimen untuk Pertanyaan no.5:
// constructor ini menerima Mesin dari LUAR -> jalur ini menjadi Aggregation,
// berbeda dari constructor Mobil(String merek) yang murni Composition.
public class MobilEksperimen {
    private String merek;
    private Mesin mesin;

    public MobilEksperimen(String merek, Mesin mesin) {
        this.merek = merek;
        this.mesin = mesin;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }

    public static void main(String[] args) {
        Mesin mesinLuar = new Mesin(); // dibuat DI LUAR class MobilEksperimen
        MobilEksperimen mobil = new MobilEksperimen("Xpander", mesinLuar);
        mobil.tampilkanInfo();
    }
}
