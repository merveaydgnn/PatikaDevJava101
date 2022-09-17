package Metotlar;


public class ReturnVoidMetotlar {
    static int sum(int a, int b)
    {
        //geriye değer döndüren metotlar
        return a+b;
    }

    //geriye değer döndürmeyen metotlar

    static void sum2(int a, int b)
    {
        int result = a+b;
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {

        //Kod main'den çalışmaya başlar.
        //return için
        int result = sum(5,2) + sum(3, 1);
        System.out.println(result);

        System.out.println(sum(5,7));

        //void için
        sum2(9,5);
        sum2(7,8);

        //Değişkenler tanımlandıkları kod bloklarına aitlerdir. Local Değişkenler denir.

    }
}
