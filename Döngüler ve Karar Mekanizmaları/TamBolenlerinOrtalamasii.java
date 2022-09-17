package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class TamBolenlerinOrtalamasii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, sayac=0, toplam=0;
        double ort = 0;
        System.out.println("Sayı giriniz :");
        sayi = input.nextInt();

        for (int i = 0; i <=sayi ; i++) {
            if(i%3==0 && i%4==0)
            {
                toplam = toplam+i;
                sayac++;
            }


        }
        ort = toplam/(sayac-1);
        System.out.println("Toplam = " + toplam);
        System.out.println("Ortalama = " + ort);
    }
}
