package Pertemuan5.Quiz1;

public class RoketUtama {
    public static void main(String[] args) {
        Roket rkt = new Roket("jet", 9000);
        Generator gnt = new Generator(5000, 110);
        SpaceShuttle ss = new SpaceShuttle("Apollo99", 3500, rkt, gnt);

        System.out.println("Kode Shuttle: " + ss.getKode());
        System.out.println("Tipe roket: " + ss.getRoketUtama().getTipe());
        System.out.println("Voltase Generator: " + ss.getGeneratorUtama().getVoltase());
    }
}
