package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Eleman sayısı giriniz : ");
        int elemanSayisi=input.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sonuc;

        for (int i = 0; i <elemanSayisi ; i++) {

            sonuc = n1+n2;

            System.out.println(n1+ " " + "+ " + n2 +  " " + "= " + sonuc);
            n1 = n2;
            n2 = sonuc;
        }
    }
}
