package Giris;

import java.util.Scanner;

public class VücutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz");
        int kilo = input.nextInt();
        double indeks = kilo/Math.pow(boy,2);

        System.out.println("Vucut kitle indeksiniz :" + indeks);
    }
}
