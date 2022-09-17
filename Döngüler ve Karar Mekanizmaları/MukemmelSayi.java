package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number : ");
            int number = input.nextInt();
            int total = 0;
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    total += i;
                }

            }
            if (total == number) {
                System.out.println(number + " is the perfect number");
            } else {
                System.out.println(number + " not is the perfect number");
            }
        }
    }
}
