package Metotlar;

import java.util.Scanner;

public class UsHesabi {
    static int result=1;
    static int power(int base, int exp)
    {
        result *=base;
        if(exp==0)
            return 1;
        else if(exp==1)
            return result;

        return power(base,exp-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        int base = input.nextInt();
        System.out.println("Üs değeri giriniz : ");
        int exp = input.nextInt();

        System.out.println(base + " ^ " + exp + " = " + power(base,exp));
    }
}
