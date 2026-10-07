package Pertemuan6.Exercise1;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif = 1; // Default awal channel 1 sesuai output

    public Televisi() {
    }

    public void pindahChannel(int channelBaru) {
        this.channelAktif = channelBaru;
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
