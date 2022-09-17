package Metotlar;

public class RecurciveOzyineliFonksiyonlar {

    static void print()
    {
        System.out.println("Hello World");
        print();
    }
    public static void main(String[] args) {

        //Bir metotun kendini çağırma tekniğidir Recurcive
        //Kendini kendi içerisinde çağırır.
        print();

    }
}
