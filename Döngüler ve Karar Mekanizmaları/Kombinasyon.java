package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kümenin eleman sayısını giriniz:");
        int n = input.nextInt();
        System.out.println("Kaç grup oluşturmak istersiniz?");
        int r = input.nextInt();
        int faktoriyel =1;
        int faktoriyel2=1;
        int faktoriyel3=1;
        int a=n-r;
        for (int i = n; i >0; i--) {

            faktoriyel = faktoriyel*i;
        }
        System.out.println(n + " nin faktoriyeli : " +faktoriyel);
        for (int i = r; i >0 ; i--) {

            faktoriyel2 = faktoriyel2*i;
        }
        System.out.println(r + " nin faktoriyeli : " +faktoriyel2);
        for (int i = a; i >0; i--) {
            faktoriyel3 = faktoriyel3*i;
        }
        System.out.println(a + " nin faktoriyeli : " +faktoriyel3);
        int hesapla= faktoriyel/(faktoriyel2*faktoriyel3 );
        System.out.println("Sonuç : " + hesapla);

    }
}
