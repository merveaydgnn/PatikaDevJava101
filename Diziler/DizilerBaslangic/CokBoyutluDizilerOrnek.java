package Diziler.DizilerBaslangic;

public class CokBoyutluDizilerOrnek {

    public static void main(String[] args) {

        int[][] matris =new int[3][4];

        int count = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                matris[i][j] = count + 1;
                count++;
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
