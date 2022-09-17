package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class BasamakSayisiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        int number = input.nextInt();
        int basValue, tempNumber =number;
        int toplam = 0;
        while(tempNumber!=0)
        {
            basValue = tempNumber%10;
            System.out.println(basValue);
            toplam = toplam+basValue;
            tempNumber/=10;
        }

        System.out.println(number + " sayısının basamak sayılarının toplamı : " + toplam);
    }
}
