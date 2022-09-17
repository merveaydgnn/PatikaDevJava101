package Diziler.ArraySınıfıVeMetotlar2;

import Diziler.ArraySınıfıVeMetotlar2.HelperArray;

public class Main {
    public static void main(String[] args) {

        int[] list = {5, 10, 15, 8, 9};
        int[] list2 = {5, 10, 15, 8, 9};
        /*HelperArray.printArray(list);
        HelperArray.fill(list,20);
        HelperArray.printArray(list);
        HelperArray.fill(list, 12, 2,5);
        HelperArray.printArray(list);*/
        HelperArray.enKucuk(list);
        System.out.println("İndeks numarası : " +HelperArray.search(list, 15));
        System.out.println();
        HelperArray.copyOf(list, 3);
        System.out.println();
        HelperArray.copyOfRange(list, 2,5);
        System.out.println();
        System.out.println(HelperArray.compare(list, list2));

    }
}
