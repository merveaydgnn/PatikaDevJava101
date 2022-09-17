package Diziler.DizilerBaslangic;

public class ForEach {

    public static void main(String[] args) {

        int[] list = new int[10];

        for (int i = 0; i <list.length ; i++) {

            list[i] = i+ 1;

        }
        int sum = 0;
        for (int liste : list) {
            sum+=liste;
            System.out.println(sum);
        }

        System.out.println("Dizideki sayıların toplam değeri : " + sum);

        System.out.println("===========================");

        String[] arabalar = {"Volvo", "Renault", "RangeRover", "Hyundai"};

        for (String araba: arabalar) {
            System.out.println(araba);
        }
    }
}
