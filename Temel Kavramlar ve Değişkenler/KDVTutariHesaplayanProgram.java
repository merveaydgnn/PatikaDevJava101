package Giris;
import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        double kdvOrani=0.18, kdvTutari,kdvliTutari;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir para miktarı giriniz");
        double tutar = input.nextDouble();
        kdvOrani = 0.18;
        kdvTutari = tutar * kdvOrani;
        kdvliTutari = tutar + kdvTutari;
        System.out.println("Kdvsiz tutar " + tutar + "\nKdv Oranı :" + kdvOrani + "\nKdv Tutarı : " + kdvTutari +
                "\nKdvli tutari : " + kdvliTutari );



    }
}
