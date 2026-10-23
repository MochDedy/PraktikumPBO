package Pertemuan7.Tugas;

public class TestSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Sudut ketiga (1 sudut diketahui 90)  : " + s.totalSudut(90));
        System.out.println("Sudut ketiga (2 sudut 60 dan 50)     : " + s.totalSudut(60, 50));
        System.out.println("Keliling (sisi 3, 4, 5)              : " + s.keliling(3, 4, 5));
        System.out.println("Keliling siku-siku (sisi 3 dan 4)    : " + s.keliling(3, 4));
    }
}

