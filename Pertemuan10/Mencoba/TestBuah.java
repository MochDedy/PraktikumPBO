package Pertemuan10.Mencoba;

public class TestBuah {
    public static void main(String[] b) {
        Manusia ilham = new Manusia();

        Apel myApel = new Apel();
        Pisang myPisang = new Pisang();
        Durian myDurian = new Durian();

        ilham.MakanBuah(myPisang);
        ilham.MakanBuah(myApel);
        ilham.MakanBuah(myDurian);
    }
}
