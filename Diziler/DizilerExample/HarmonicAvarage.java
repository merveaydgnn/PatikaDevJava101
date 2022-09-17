package Diziler.DizilerExample;

public class HarmonicAvarage {

    public static void main(String[] args) {

        double[] arr = {5, 15, 8, 22, 24};

        double harmonicAvarage = 0.0;
        double harmonikSeries = 0.0;

        for(double i : arr)
        {
            harmonikSeries+=1/i;
        }

        harmonicAvarage = arr.length/harmonikSeries;

        System.out.println("Harmonic avarage : " + harmonicAvarage);
    }
}
