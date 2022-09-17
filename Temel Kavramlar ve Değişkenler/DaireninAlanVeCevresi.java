package Giris;

import java.util.Scanner;

public class DaireninAlanVeCevresi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cevre, alan;
        System.out.println("Dairenin yaricapini giriniz : ");
        int r = input.nextInt();
        cevre = 2*Math.PI*r;
        alan = Math.PI*Math.pow(r,2);
        System.out.println("Dairenin cevresi = " + cevre + "\nDairenin alani = " + alan);
    }
}
