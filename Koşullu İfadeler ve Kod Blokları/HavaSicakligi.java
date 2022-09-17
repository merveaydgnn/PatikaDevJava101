import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık giriniz : ");
        int sicaklik = input.nextInt();

        if(sicaklik < 5)
        {
            System.out.println("Kayak yapabilirsin");
        }
        else if (sicaklik<15) {
            System.out.println("Sinemaya gidebilirsin ");
        }
        else if(sicaklik<25)
        {
            System.out.println("Pikniğe gidebilirsin.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
