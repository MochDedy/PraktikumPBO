package Pertemuan5.Quiz1;

public class Generator {
    private int daya;
    private int voltase;

    public Generator(int daya, int voltase) {
        this.daya = daya;
        this.voltase = voltase;
    }

    public int getDaya() {
        return daya;
    }

    public void setTipe(int daya) {
        this.daya = daya;
    }

    public int getVoltase() {
        return voltase;
    }

    public void setVoltase(int voltase) {
        this.voltase = voltase;
    }
}
