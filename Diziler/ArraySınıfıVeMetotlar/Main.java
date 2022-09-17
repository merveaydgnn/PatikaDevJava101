package Diziler.ArraySınıfıVeMetotlar;

public class Main {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        int[] list2 = {5, 12, 52, 45, 74};
        double[] list3 = {6.2, 7.4, 8.5, 9.6};
        HelperArray array = new HelperArray();
        array.printArray(list);
        System.out.println();
        array.printArray(list2);
        System.out.println();
        array.printArray(list3);


    }
}
