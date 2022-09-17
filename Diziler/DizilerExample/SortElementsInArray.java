package Diziler.DizilerExample;

import java.util.Arrays;
import java.util.Scanner;

public class SortElementsInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("The size of the array is n : ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i <size; i++) {

            System.out.print(i + 1  + ". Element : ");
            int element = input.nextInt();
            list[i] = element;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
