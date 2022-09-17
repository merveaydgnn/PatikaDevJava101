package Diziler.DizilerBaslangic;

public class Main {

    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (i*10) * 10;
            System.out.println(arr[i]);
        }
    }

    //Overloading => Aşırı yüklenme işlemi
    static void printArray(double[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (i*10) * 10.2;
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        int[] list = new int[10];
        double[] list2 = new double[10];
       //int[] list3 = {10,20,30,40,50,60,70,80,90,100};
       // int list2[] =  new int[20];
      /*  list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;
        list[5] = 60;
        list[6] = 70;
        list[7] = 80;
        list[8] = 90;
        list[9] = 100;*/

      /*  int count = 1;
        for (int i = 0; i <list.length ; i++) {

            list[i] = count * 10;
            count++;
            System.out.println(list[i]);


        }

       /* for (int i = 0; i <list.length ; i++) {

            System.out.println(list[i]);
        }
*/

        System.out.println("======================");

        printArray(list);

        System.out.println("======================");
        printArray(list2);

    }
}
