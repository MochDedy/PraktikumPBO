package Pertemuan1.Tugas1;

public class Demo {
    public static void main(String[] args) {

        laptop laptop = new laptop("MSI", 2024, 16, 15.6);
        kipasSanyo kipas = new kipasSanyo("SANYO", 2023, 3, 45);
        pintu pintu = new pintu("Coklat Tua", 210);
        meja meja = new meja("Coklat Muda", 120);

        System.out.println("--------------------------");
        laptop.cetakInformasi();
        laptop.nyalakan();
        laptop.bukaLaptop();
        laptop.jalankanProgram();
        laptop.matikan();

        System.out.println("\n--------------------------");
        kipas.cetakInformasi();
        kipas.nyalakan();
        kipas.aturKecepatan();
        kipas.berhentiBerputar();
        kipas.matikan();

        System.out.println("\n--------------------------");
        pintu.cetakInformasi();
        pintu.buka();
        pintu.tutup();

        System.out.println("\n--------------------------");
        meja.cetakInformasi();
        meja.taruhBarang("Laptop");
        meja.lap();
    }
}
