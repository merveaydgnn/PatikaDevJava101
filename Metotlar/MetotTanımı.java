package Metotlar;

import java.util.Scanner;

public class MetotTanımı {

    public static int usAlma(int a, int us)
    {
        int result = (int) Math.pow(a,us);
        System.out.println(a + "^" + us + " = " + result);
        return result;
    }
    public static void main(String[] args) {

        //Kendini tekrar etme
        //Don't Repeat Yourself

        //Metotlar sınıflar içerisine yazılır. Metodun içerisine metot tanımlanamaz
        int base = 2, exp = 2, result = 1;

        for (int i = 1; i <=3 ; i++) {
            result*=base;
        }
        System.out.println(result);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base : ");
        int taban = input.nextInt();
        System.out.print("Enter a exp : ");
        int us = input.nextInt();
        usAlma(taban, us);
    }

}
