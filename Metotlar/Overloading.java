package Metotlar;

public class Overloading {

   static void print()
    {
        System.out.println("Parametresiz metot");
    }
    //Overloading
    //Aynı işlemi farklı parametrelerde yapabilmek

    static void print(int a)
    {
        System.out.println("Parametreli " + a);
    }
    static void print(double a)
    {
        System.out.println("Parametreli double " + a);
    }

    static int print(int a, int b)
    {
        return a+b;
    }
    static int print(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        /*İki veya daha fazla metot Parametreler açısından
        farklılık gösteriyorsa aynı isme sahip olabilirler.
         */
        print();
        print(7);
        print(12.0);
        System.out.println(print(2,3));
        System.out.println(print(2,3,5));

    }
}
