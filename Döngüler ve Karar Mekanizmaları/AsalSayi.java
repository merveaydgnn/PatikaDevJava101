package DongulerVeKararMekanizmalari;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 2; i <=100; i++) {
            boolean asalMi=true;
            for (int j = 2; j < i; j++) {

                if(i%j==0)
                {
                    asalMi=false;
                    break;

                }

            }
            if(asalMi==true)
            {
                System.out.print(i +" ");
            }

        }
    }
}

