package Diziler.DizilerExample;


import java.util.Arrays;

public class ArraysRepeatingEvenNumbers {

    static boolean isFind(int[] arr, int value)
    {
        for(int i: arr){

            if(i == value)
                return true;
        }

        return false;
    }
    public static void main(String[] args) {

        int[] list = {3, 6, 3, 5, 6, 5, 3, 9, 9, 2, 3, 2, 6, 4};
        int[] duplicateEven = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if((i!=j) && list[i] == list[j] && list[i]%2==0){

                    if (!isFind(duplicateEven, list[i])){
                        duplicateEven[startIndex++] = list[i];
                    }
                   break;
                }
            }
        }

        for(int value : duplicateEven){
            if(value!=0){
                System.out.print(value +  " ");
            }
        }
    }
}
