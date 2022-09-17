package Giris;
import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        System.out.println("Birinci kenari giriniz:");
        a = input.nextInt();
        System.out.println("Ikinci kenari giriniz:");
        b = input.nextInt();
        double sonuc = Math.pow(a,2)  + Math.pow(b,2);
        c = Math.sqrt(sonuc);
        System.out.println("Hipotenus : " + c);


    }
}
