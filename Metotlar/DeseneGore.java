package Metotlar;

import java.util.Scanner;

public class DeseneGoreMetot {

    static int sonuc = 0;
    static void desen(int a)
    {
        if(a>0)
        {
            System.out.println(a + " ");
            desen(a-5);
        }
        System.out.println(a + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n değeri girin : ");
        int n = input.nextInt();
        desen(n);




    }
}
