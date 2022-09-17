package Diziler.DizilerBaslangic;

public class TekBoyutluDiziler {

    public static void main(String[] args) {

        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe",
        "Cuma", "Cumartesi", "Pazar"};

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("===========");
        String ay[] = new String[]{"Ocak", "Şubat","Mart"};
        ay[2] = "Nisan"; //varsayılan atama
        for (int i = 0; i < ay.length; i++) {
            System.out.println(ay[i]);
        }
    }
}
