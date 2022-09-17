package Giris;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut; double elma; double domates; double muz;
        double patlican;
        double kilo;
        double toplam = 0;
        System.out.println("Armut kac kilo");
        kilo = input.nextInt();
        armut = kilo*2.14;
        System.out.println("Elma kac kilo");
        kilo = input.nextInt();
        elma = kilo*3.67;
        System.out.println("Domates kac kilo");
        kilo = input.nextInt();
        domates = kilo*1.11;
        System.out.println("Muz kac kilo");
        kilo = input.nextInt();
        muz = kilo*0.95;
        System.out.println("Patlıcan kac kilo");
        kilo = input.nextInt();
        patlican = kilo*5.00;
        toplam = armut + elma + domates + muz + patlican;
        System.out.println("Toplam tutar : " +toplam);


    }
}
