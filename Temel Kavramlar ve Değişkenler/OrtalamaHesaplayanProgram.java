package Giris;
import java.util.Scanner;
public class OrtalamaHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sınav notunu giriniz:");
        int birinciSinav = input.nextInt();
        System.out.println("2. sınav notunu giriniz:");
        int ikinciSinav = input.nextInt();
        System.out.println("3. sınav notunu giriniz:");
        int ucuncuSinav = input.nextInt();

        double ortalama = (birinciSinav + ikinciSinav + ucuncuSinav)/3;
        System.out.println("Sınav ortalamanız : " + ortalama);

        String sonuc = ortalama > 60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}
