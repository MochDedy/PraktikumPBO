package Pertemuan1.Tugas1;

public class laptop extends elektronik {
    int ram;
    double ukuranLayar;

    public laptop(String merek, int tahunProduksi, int ram, double ukuranLayar) {
        super(merek, tahunProduksi);
        this.ram = ram;
        this.ukuranLayar = ukuranLayar;
    }

    public void bukaLaptop() {
        System.out.println("Laptop dibuka.");
    }

    public void jalankanProgram() {
        System.out.println("Laptop menjalankan program.");
    }

    @Override
    public void cetakInformasi() {
        System.out.println("=== INFORMASI LAPTOP ===");
        super.cetakInformasi();
        System.out.println("RAM             : " + ram + " GB");
        System.out.println("Ukuran Layar    : " + ukuranLayar + " inch");
    }
}
