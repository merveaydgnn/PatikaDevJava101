package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Mesafe giriniz");
        int mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz");
        int yas = input.nextInt();
        System.out.println("1 => Tek Yön 2 => Çift yön mü?");
        int yon = input.nextInt();
        double tutar;
        double indirimliTutar;
        double yasindirimi;
        double gidisdonus;
        double toplamTutar;
        if(mesafe <=0 || yas <=0 || yon<1 || yon>2)
        {
            System.out.println("Hatalı ver girdiniz.");
        }
        else
        {
            if(yas<12 )
            {
                if(yon==2)
                {
                    tutar = mesafe*0.10;
                    yasindirimi = tutar*0.50;
                    indirimliTutar = tutar-yasindirimi;
                    gidisdonus = indirimliTutar*0.20;
                    toplamTutar = (indirimliTutar-gidisdonus)*2;
                    System.out.println(toplamTutar);
                }
                else
                {
                    tutar = mesafe*0.10;
                    yasindirimi = tutar*0.50;
                    indirimliTutar = tutar-yasindirimi;
                    System.out.println(indirimliTutar);

                }

            }
            else if(yas>12 && yas<=24)
            {
                if(yon==2) {
                    tutar = mesafe * 0.10;
                    yasindirimi = tutar * 0.10;
                    indirimliTutar = tutar - yasindirimi;
                    gidisdonus = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisdonus)*2;
                    System.out.println("Toplam tutar = " +toplamTutar);
                }
                else
                {
                    tutar = mesafe*0.10;
                    yasindirimi = tutar*0.10;
                    indirimliTutar = tutar-yasindirimi;
                    System.out.println(indirimliTutar);
                    System.out.println("Toplam tutar = " + indirimliTutar);
                }
            }
            else if(yas>24 && yas<=65)
            {
                if(yon==2) {
                    tutar = mesafe * 0.10;
                    gidisdonus = tutar * 0.20;
                    toplamTutar = (tutar - gidisdonus)*2;
                    System.out.println("Toplam tutar = " +toplamTutar);
                }
                else
                {
                    tutar = mesafe*0.10;
                    System.out.println("Toplam tutar = " + tutar);
                }
            }

            else if(yas>65)
            {
                if(yon==2) {
                    tutar = mesafe * 0.10;
                    yasindirimi = tutar * 0.30;
                    indirimliTutar = tutar - yasindirimi;
                    gidisdonus = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisdonus)*2;
                    System.out.println("Toplam tutar = " +toplamTutar);
                }
                else
                {
                    tutar = mesafe*0.10;
                    yasindirimi = tutar*0.30;
                    indirimliTutar = tutar-yasindirimi;
                    System.out.println(indirimliTutar);
                    System.out.println("Toplam tutar = " + indirimliTutar);
                }
            }
        }

    }
}
