package id.ac.polinema.relasiclass.percobaan6;

public class Laptop {
    private String merk;

    public Laptop(String merk) {
        this.merk = merk;
    }

    // Printer HANYA muncul sebagai parameter method, tidak pernah jadi atribut -> Dependency (uses-a)
    public void cetakDokumen(Printer printer, String namaFile) {
        System.out.println(merk + " mengirim dokumen ke printer...");
        printer.cetak(namaFile);
    }
}
