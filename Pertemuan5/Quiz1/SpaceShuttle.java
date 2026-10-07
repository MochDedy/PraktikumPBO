package Pertemuan5.Quiz1;

public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    public SpaceShuttle(String kode, int berat, Roket RoketUtama, Generator GeneratorUtama) {
        this.kode = kode;
        this.berat = berat;
        this.RoketUtama = RoketUtama;
        this.GeneratorUtama = GeneratorUtama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public Roket getRoketUtama() {
        return RoketUtama;
    }

    public void setRoketUtama(Roket RoketUtama) {
        this.RoketUtama = RoketUtama;
    }

    public Generator getGeneratorUtama() {
        return GeneratorUtama;
    }

    public void setGeneratorUtama(Generator GeneratorUtama) {
        this.GeneratorUtama = GeneratorUtama;
    }

}
