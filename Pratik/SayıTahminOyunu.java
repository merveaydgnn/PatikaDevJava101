package Pratik;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);
        int rigth = 0; //hak
        int selected;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrong = new int[5]; // girilen yanlış değerleri dizide tutuyoruz.
        System.out.println(number);
        while (rigth < 5){
            System.out.println("Lütfen tahmininizi giriniz : ");
            selected =input.nextInt();

            if(selected < 0 || selected > 100)
            {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz. ");
                if(isWrong){
                    rigth++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız : " + (5 - rigth));

                }
                else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkinizdan düşülecektir.");

                }
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler doğru tahmin ! Tahmin ettiginiz sayı : " + number);
                isWin = true;
                break;

            }else

                if(selected > number){
                    System.out.println(selected + " sayısı gizli değerden büyüktür.");
            }
                else {
                    System.out.println(selected + " sayısı gizli değerden küçüktür.");
                }
                wrong[rigth++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - rigth));
        }

        if (!isWin)
        {
            System.out.println("Oyunu kaybettiniz ! ");
            System.out.println("Tahminleriniz ");
            if(!isWrong) {
                for (int i : wrong) {
                    if (i != 0) {
                        System.out.print(i + " ");
                    }

                }
            }
            System.out.println("Tahmin sayısı: " + number);
        }

    }
}
