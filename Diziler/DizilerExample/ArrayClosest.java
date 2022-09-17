package Diziler.DizilerExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClosest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.println("Enter a number : ");
        int number = input.nextInt();
        int min = array[0];
        int max = array[0];
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i : array){

            if(i<number)
            {
                min = i;
            }

            if(i>number)
            {
                max = i;
                break;
            }
        }




        System.out.println("The nearest number smaller than the entered number : " + min);
        System.out.println("The nearest number greater than the entered number : " + max);
    }
}
