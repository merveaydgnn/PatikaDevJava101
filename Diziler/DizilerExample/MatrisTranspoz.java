package Diziler.DizilerExample;

import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satır giriniz : ");
        int row  = input.nextInt();
        System.out.println("Sütun giriniz : ");
        int col = input.nextInt();
        int[][] matris = new int[row][col];

        int[][] transpoz = new int[col][row];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println(i + "x" + j + " matrisi gir : ");
                matris[i][j] = input.nextInt();
                
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris");
        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpoz");
        for (int i = 0; i < transpoz.length; i++) {

            for (int j = 0; j < transpoz[i].length; j++) {

                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
