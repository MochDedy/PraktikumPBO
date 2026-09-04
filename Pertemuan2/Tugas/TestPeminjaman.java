package Pertemuan2.Tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman member1 = new Peminjaman();
        member1.id=101;
        member1.namaMember="Dedy";
        member1.namaGame="GTA V";
        member1.lamaSewa=3;
        member1.hargaSewa= 5000;
        member1.hitungTotBayar();
        member1.tampilData();
    }
}
