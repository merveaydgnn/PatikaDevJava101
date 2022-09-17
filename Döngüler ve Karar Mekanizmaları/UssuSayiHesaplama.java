package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class UssuSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,us;
        System.out.println("Üssü alınacak sayı :");
        sayi = input.nextInt();

        System.out.println("Üs olacak sayı : ");
        us = input.nextInt();
        int total =1;
        for (int i = 1; i <= us; i++) {

            total *=sayi;
        }
        System.out.println(total);
    }
}
