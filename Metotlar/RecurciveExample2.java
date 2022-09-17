package Metotlar;

public class RecurciveExample2 {

    static int f(int x)
    {
        int result =0;
        for (int i = 1; i <=x; i++) {
            result+=i;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(f(3));
    }
}
