package Pertemuan6.Exercise1;

public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String dvd = "kosong"; // Default awal DVD "kosong" sesuai output

    public TelevisiModern(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
    }

    public void gantiModusTampilan(String modus) {
        this.modusTampilan = modus;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }

    public void masukkanDVD(String judulDVD) {
        this.dvd = judulDVD;
    }
}
