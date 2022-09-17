package Diziler.DizilerExample;

public class ArraysAvarage {

    public static void main(String[] args) {

        int[] arr = {12, 65, 25, 85, 45, 50, 14};
        double avarage = 0.0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        avarage = sum/arr.length;

        System.out.println("Dizideki elemanların ortalaması : " + avarage);
    }
}
