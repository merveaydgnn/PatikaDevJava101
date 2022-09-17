package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class EBOBEKOK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2;

        System.out.println("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz: ");
        n2 = input.nextInt();
    boolean dogruMu =false;
    int count = 1;
    int ebob = 0;
    int ekok = 0;
        while(count<n1)
        {
            if(n1%count==0 && n2%count==0)
            {
                ebob=count;
            }

            count++;
        }
        System.out.println("EBOB : " + ebob);


        while(count<(n1*n2))
        {
            if(count%n1==0 && count%n2==0)
            {
                ekok=count;
                break;
            }
            count++;
        }
        System.out.println("EKOK : " + ekok);
    }
}
