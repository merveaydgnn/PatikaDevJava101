package Diziler.DizilerBaslangic;

public class CokBoyuluDiziler {

    public static void main(String[] args) {

        int[][] matris = new int[6][6];

        matris[0][0] = 0;

        matris[2][3] = 839;

        System.out.println(matris[2][3]);

        int[][] matris2 = {
                {0, 453, 939, 243, 783, 891},
                {450, 0, 586, 852, 457, 588},
                {458, 854, 0, 745, 86, 758},
                {477, 252, 100, 0, 789, 525},
                {745, 50, 96, 732, 0, 200},
                {45, 800, 630, 745, 521, 0}

        };

        System.out.println(matris2[5][4]);
    }
}
