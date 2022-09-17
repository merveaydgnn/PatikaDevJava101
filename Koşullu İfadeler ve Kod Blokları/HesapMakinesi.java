package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        sayi2 = input.nextInt();

        System.out.println("Hangi işlemi yapmak istiyorsunuz Toplama 1, " +
                "ıkarma 2, Çarpma 3, Bölme 4");
        int secim = input.nextInt();
        switch(secim)
        {
            case 1:
                sonuc = sayi1+sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 2:
                sonuc = sayi1-sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 3:
                sonuc = sayi1*sayi2;
                System.out.println("Sonuç = "+ sonuc);
                break;
            case 4:
                if(sayi2!=0)
                {
                    sonuc=sayi1/sayi2;
                    System.out.println("Sonuç = "+ sonuc);
                }
                else
                    System.out.println(("Bir sayı sıfıra bölünmez."));

                break;
            default :
                System.out.println("Yanlış seçim yaptınız.");
        }


    }
}
