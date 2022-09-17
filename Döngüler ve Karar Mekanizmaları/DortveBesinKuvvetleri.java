package DongulerVeKararMekanizmalari;

import java.util.Scanner;
public class DortveBesinKuvvetleri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k=1;
        System.out.println("Sayı giriniz :");
        int sayi = input.nextInt();

        System.out.println("Dördün kuvvetleri");
        for (int i = 1; i <=sayi; i*=4) {
            System.out.println(i);
        }

        System.out.println("Beşin kuvvetleri");
        for (int i = 1; i <=sayi; i*=5) {
            System.out.println(i);
        }
    }
}
