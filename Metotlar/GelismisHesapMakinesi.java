package Metotlar;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b)
    {
        int result = a+b;
        System.out.println("Toplam = " + result);
        return result;
    }

    static int ext(int a, int b)
    {
        int result = a-b;
        System.out.println("Çıkarma = " + result);
        return result;
    }
    static int imp(int a, int b)
    {
        int result = a*b;
        System.out.println("Çarpma = " + result);
        return result;
    }
    static double divide(int a, int b)
    {
        double result = a/b;
        if(b==0)
        {
            System.out.println("Bölünemez.");
            return 0;
        }
        System.out.println("Bölme= " + result);
        return result;
    }
    static int power(int a, int b)
    {
        int result=1;
        for (int i = 1; i <=b ; i++) {
            result*=a;
        }
        return result;
    }

    static int modding(int a,int b)
    {
        int sonuc = a%b;
        return sonuc;
    }

    static int rectangle(int a, int b)
    {
        int cevre = 2*(a+b);
        int alan=a*b;
        System.out.println("Alan " + alan);
        System.out.println("Çevre " + cevre);
        return cevre;
    }

    static int faktorial(int a)
    {
        int faktorial = 1;
        for (int i = a; i >0; i--) {
            faktorial*=i;

        }
        return faktorial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Mod Alma\n"
                + "7 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "8 - Faktoriyel Hesaplama\n"
                + "0 - Çıkış Yap\n";
        do {
            System.out.println(menu);

            System.out.println("Bir işlem seçiniz :");
            select = input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("İlk sayı giriniz : ");
            int a =input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b=input.nextInt();
            switch (select)
            {
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    ext(a,b);
                    break;
                case 3:
                    imp(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    System.out.println((modding(a,b)));

                    break;
                case 7:
                    rectangle(a,b);
                    break;
                case 8:
                    System.out.println(faktorial(a));
                    System.out.println(faktorial(b));
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz.");
                    break;

            }
        }while(select!=0);
        System.out.println("Güle Güle..");

    }
}
