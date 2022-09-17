package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class HarmonikSeriFormul {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number = input.nextInt();
        double total = 0;
        for (int i = 1; i <=number ; i++) {

            total +=1.0/i;
        }
        System.out.println(total);
    }
}
