package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Kullanıcı Adı giriniz : ");
        String username = input.nextLine();
        System.out.println("Şifre giriniz : ");
        String password = input.nextLine();

       if(username.equals("patika") && password.equals("12345"))
       {
           System.out.println("Giriş yapıldı.");
       }

       else
       {
           System.out.println("Hatalı şifre girdiniz. Şifrenizi yenilemek ister misiniz Evet/Hayır");
           String secim = input.nextLine();
           if(secim.equals("Hayır"))
           {
               System.out.println("Giriş sonlandırıldı");
           }
           else
           {
               System.out.println("Lütfen yeni bir şifre oluşturunuz.");
               String newPassword = input.nextLine();
               if(newPassword.equals(password) || newPassword.equals("12345"))
               {
                   System.out.println("Aynı şifre oluşturulamaz. Lütfen tekrar deneyiniz.");
               }
               else{
                   System.out.println("Şifre başarıyla yenilendi.");
               }
           }
       }

    }
}
