package Pertemuan3.tugas;

import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        
        boolean berhasilTambah = false;
        while (!berhasilTambah) {
            System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
            double tambah = scanner.nextDouble();

            if (kontainerAlfa.getBeratMuatanSaatIni() + tambah <= kontainerAlfa.getKapasitasMaksimal()) {
                kontainerAlfa.tambahMuatan(tambah);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                berhasilTambah = true;
            } else {
                System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer. Silakan masukkan ulang.");
            }
        }

        boolean berhasilTurun = false;
        while (!berhasilTurun) {
            System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
            double turun = scanner.nextDouble();

            double batasMaksimal = kontainerAlfa.getBeratMuatanSaatIni() * 0.5;

            if (turun > batasMaksimal) {
                System.out.println(
                        "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini! Silakan masukkan ulang.");
            } else if (turun > kontainerAlfa.getBeratMuatanSaatIni()) {
                System.out.println(
                        "Maaf, berat muatan yang diturunkan melebihi muatan saat ini. Silakan masukkan ulang.");
            } else {
                kontainerAlfa.turunkanMuatan(turun);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
                berhasilTurun = true;
            }
        }

        scanner.close();
    }
}