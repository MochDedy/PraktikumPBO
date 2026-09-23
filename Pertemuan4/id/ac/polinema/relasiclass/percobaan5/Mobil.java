package id.ac.polinema.relasiclass.percobaan5;

public class Mobil {
    private String merek;
    private Mesin mesin;

    // Mesin dibuat SENDIRI oleh Mobil di sini -> Composition.
    // Sengaja TIDAK ada setMesin()/getMesin() (lihat catatan di jobsheet Langkah 4).
    public Mobil(String merek) {
        this.merek = merek;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
        System.out.println("Mesin: " + mesin.getTipe());
    }
}
