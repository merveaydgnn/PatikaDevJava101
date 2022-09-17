package Diziler.ArraySınıfıVeMetotlar2;

public class HelperArray {

    /*Bir metodun başına static yazarsak, Main sınıfında nesne
    üretmeden direkt ismiyle çağırabiliyoruz*/
    static void printArray(int[] arr)
    {
        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    static int[] fill(int[] arr, int value){

        for (int i = 0; i < arr.length; i++) {
            arr[i] =value;
        }
        return arr;
    }

    static int[] fill(int[] arr, int value,int basDeger, int sonDeger)
    {
        for (int i = basDeger; i < sonDeger; i++) {
            arr[i]=value;

        }
        return arr;
    }

    static void enKucuk(int arr[])
    {
        int enKucuk = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<enKucuk)
            {
                enKucuk = arr[i];
            }

        }
        System.out.print(enKucuk + " ");
        System.out.println();
    }

    static int search(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    static void copyOf(int[] arr,int value)
    {
        for (int i = 0; i < value ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void copyOfRange(int[] arr, int fromIndex, int toIndex)
    {
        for (int i = fromIndex; i < toIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static boolean compare(int[] arr, int[] arr2)
    {
        if(arr.length != arr2.length){
            return false;
        }
        for (int i = 0, j=0; i < arr.length ; i++, j++) {
            if(arr[i] != arr2[j]) {
                return false;
            }
        }
        return true;
    }
















}
