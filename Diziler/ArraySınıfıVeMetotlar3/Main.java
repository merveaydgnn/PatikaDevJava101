package Diziler.ArraySınıfıVeMetotlar3;

import java.sql.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        int[] list2 = {5, 12, 52, 45, 74, -9, 58, -25, 100, 99, -28};
        double[] list3 = {6.2, 7.4, 8.5, 9.6};

        System.out.println(Arrays.toString(list2));

/*      Arrays.fill(list, 10);

        System.out.println(Arrays.toString(list));
    */
        Arrays.fill(list, 1,3,13);
        System.out.println(Arrays.toString(list));

        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println();
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        System.out.println(Arrays.binarySearch(list2, -9));

        int[] copyList = Arrays.copyOf(list2, 4);
        System.out.println(Arrays.toString(copyList));

        int[] copyListRange = Arrays.copyOfRange(list2, 2, 5);
        System.out.println(Arrays.toString(copyListRange));

        int[] liste1 = {1, 2, 3};
        int[] liste2 = {1, 2, 3};
        int[] liste3 = {4, 2, 3};

        System.out.println(Arrays.equals(liste1,liste2));
        System.out.println(Arrays.equals(liste2,liste3));



    }
}
