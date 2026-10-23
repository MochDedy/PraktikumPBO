package Pertemuan7.Tugas;

public class TestManusia {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();
        Manusia m3 = new Mahasiswa();

        m1.bernafas();
        m1.makan();

        m2.bernafas();
        m2.makan();

        m3.bernafas();
        m3.makan();

        ((Dosen) m2).lembur();
        ((Mahasiswa) m3).tidur();
    }
}
