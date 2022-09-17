package Giris;

import java.util.Scanner;

public class TaksiMetreBulanProgram {

    public static void main(String[] args) {
        //Girilen mesafeye (km) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Scanner input = new Scanner(System.in);
        int mesafe;
        double perKm = 2.20, tutar = 10;
        System.out.println("Gidilen mesafeyi (km) giriniz : ");
        mesafe = input.nextInt();
        tutar += (mesafe*perKm);

        tutar = tutar < 20 ? 20 : tutar;

        System.out.println("Taksimetre tutari " + tutar);








    }
}
