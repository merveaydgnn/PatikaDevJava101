package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class BurcProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day;
        String month;

        System.out.println("Doğduğunuz günü giriniz : ");
        day = input.nextInt();
        String cumle = input.nextLine();
        System.out.println("Doğduğunuz ayı giriniz : ");
        month=input.nextLine();

        if(month.equals("Ocak"))
        {
            if(day>21 && day<32)
                System.out.println("Kova Burcu");
            else
                System.out.println("Oğlak Burcu");
        }
        if(month.equals("Şubat"))
        {
            if(day>19 && day<29)
                System.out.println("Balık Burcu");
            else
                System.out.println("Kova Burcu");
        }
        if(month.equals("Mart"))
        {
            if(day>20 && day<32)
                System.out.println("Koç Burcu");
            else
                System.out.println("Balık Burcu");
        }
        if(month.equals("Nisan"))
        {
            if(day>20 && day<31)
                System.out.println("Boğa Burcu");
            else
                System.out.println("Koç Burcu");
        }
        if(month.equals("Mayıs"))
        {
            if(day>21 && day<32)
                System.out.println("İkizler Burcu");
            else
                System.out.println("Boğa Burcu");
        }

        if(month.equals("Haziran"))
        {
            if(day>22 && day<31)
                System.out.println("Yengeç Burcu");
            else
                System.out.println("İkizler Burcu");
        }
        if(month.equals("Temmuz"))
        {
            if(day>22 && day<32)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Yengeç Burcu");
        }
        if(month.equals("Ağustos"))
        {
            if(day>22 && day<32)
                System.out.println("Başak Burcu");
            else
                System.out.println("Aslan Burcu");
        }
        if(month.equals("Eylül"))
        {
            if(day>22 && day<31)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Başak Burcu");
        }
        if(month.equals("Ekim"))
        {
            if(day>22 && day<32)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Terazi Burcu");
        }
        if(month.equals("Kasım"))
        {
            if(day>22 && day<31)
                System.out.println("Yay Burcu");
            else
                System.out.println("Akrep Burcu");
        }
        if(month.equals("Aralık"))
        {
            if(day>22 && day<32)
                System.out.println("Oğlak Burcu");
            else
                System.out.println("Yay Burcu");
        }
    }
}
