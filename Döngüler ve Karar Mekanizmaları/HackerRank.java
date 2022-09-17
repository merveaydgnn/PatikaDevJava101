package DongulerVeKararMekanizmalari;
import java.util.*;
import java.io.*;

public class HackerRank {

    public static void main(String[] args) {


        class Solution{
            public static void main(String []argh){
                Scanner in = new Scanner(System.in);
                int t=in.nextInt();

                for(int i=0;i<t;i++){
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int n = in.nextInt();

                    int sonuc=a;

                    for (int j = 0; j < n; j++) {

                        sonuc +=(Math.pow(2, j)) * b;
                        System.out.print(sonuc + " ");
                    }
                    System.out.println();
                }
                in.close();
            }
        }

    }
}
