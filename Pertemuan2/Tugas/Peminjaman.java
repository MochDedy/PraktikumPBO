package Pertemuan2.Tugas;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int hargaSewa;
    public int totalBayar;

    public int hitungTotBayar(){
        totalBayar = lamaSewa * hargaSewa;
        return totalBayar;
    }

    public void tampilData(){
        System.out.println("Id Peminjam     : " +id);
        System.out.println("Nama Member     : " + namaMember);
        System.out.println("Nama Game       : " + namaGame);
        System.out.println("Lama Sewa       : " +lamaSewa);
        System.out.println("Total Bayar     : " + totalBayar);
    }
}
