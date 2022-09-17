package Metotlar;

import java.util.Scanner;
public class AsalSayiRecursive {
    static void asalMi(int sayi, int index)
    {
        if(index==sayi)
        {
            System.out.println(sayi + " sayısı ASALDIR!");
            return;
        }
         else if(sayi%index==0)
        {
            System.out.println(sayi + "sayısı ASAL değildir!");
            return;
        }
         asalMi(sayi, index+1);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while(true)
        {

            System.out.println("Sayı giriniz : ");
            int sayi=input.nextInt();
            if(sayi==0)
            {
                break;
            }

            asalMi(sayi,2);
        }

    }
}
