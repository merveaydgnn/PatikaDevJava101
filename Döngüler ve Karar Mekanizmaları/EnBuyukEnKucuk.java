package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class EnBuyukEnKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, big=0, small=0;
        System.out.println("How many numbers will you enter?");
        int count = input.nextInt();
        int number =0;
        for (int i = 1; i <=count; i++) {
            System.out.print(i + " . enter a number : ");
            number = input.nextInt();
            if(number>big)
            {
                big=number;
            }
            if(number<small)
            {
                small = number;
            }
        }

        System.out.println("The biggest number : " + big);
        System.out.println("The smallest number : " + small);
        
    }
}
