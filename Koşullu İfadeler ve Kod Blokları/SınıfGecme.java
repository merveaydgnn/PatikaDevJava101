package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double avarage = 0;
        double total=0;
        int count=0;
        System.out.println("Matematik notunuzu giriniz");
        int mat = input.nextInt();
        if(mat<0 || mat>100)
        {
            System.out.println("Notunuz 0-100 arasında değil, ortalamaya katılamaz.");
        }
        else
        {
            total+=mat;
            count+=1;
        }
        System.out.println("Fizik notunuzu giriniz");
        int fizik = input.nextInt();
        if(fizik<0 || fizik>100)
        {
            System.out.println("Notunuz 0-100 arasında değil, ortalamaya katılamaz.");
        }
        else
        {
            total+=fizik;
            count+=1;
        }
        System.out.println("Türkçe notunuzu giriniz");
        int turkce = input.nextInt();
        if(turkce<0 || turkce>100)
        {
            System.out.println("Notunuz 0-100 arasında değil, ortalamaya katılamaz.");
        }
        else
        {
            total+=turkce;
            count+=1;
        }
        System.out.println("Kimya notunuzu giriniz");
        int kimya = input.nextInt();
        if(kimya<0 || kimya>100)
        {
            System.out.println("Notunuz 0-100 arasında değil, ortalamaya katılamaz.");
        }
        else
        {
            total+=kimya;
            count+=1;
        }
        System.out.println("Müzik notunuzu giriniz");
        int muzık = input.nextInt();
        if(muzık<0 || muzık>100)
        {
            System.out.println("Notunuz 0-100 arasında değil, ortalamaya katılamaz.");
        }
        else
        {
            total+=muzık;
            count+=1;
        }


        avarage = total/count;
        if(avarage >55)
        {
            System.out.println("Başarıyla geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }
        System.out.println("Ortalamanız " + avarage);

    }
}
