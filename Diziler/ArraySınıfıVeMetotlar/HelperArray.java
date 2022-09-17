package Diziler.ArraySınıfıVeMetotlar;

public class HelperArray {

    public void printArray(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public void printArray(double[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}
