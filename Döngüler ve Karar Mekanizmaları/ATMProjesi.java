package DongulerVeKararMekanizmalari;

import java.util.Scanner;

public class ATMProjesi2{
    public static void main(String[] args) {
        String password, userName;
        Scanner input = new Scanner(System.in);
        int rigth = 3;
        int balance = 1500, tutar, tutar2;
        int select;
        while(rigth>0) {
            System.out.println("Kullanıcı adını giriniz : ");
            userName = input.nextLine();
            System.out.println("Şifre giriniz : ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123"))
            {
                do{
                    System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.print("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış \n" +
                            "Lütfen yapmk istediğiniz işlemi seçiniz");

                    select = input.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            int price = input.nextInt();
                            if(price<0)
                            {
                                System.out.println("Hatalı tutar girdiniz.");
                            }
                            else{
                                if(price>balance)
                                    System.out.println("Yetersiz bakiye");

                                else{
                                    System.out.println(price + " TL para çekimi işlemi gerçekleşmiştir.");
                                    balance -= price;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Para yatıracağınız tutarı giriniz : ");
                            price = input.nextInt();
                            if(price<0)
                            {
                                System.out.println("Hatalı giriş yaptınız");
                            }
                            else {
                                System.out.println(price + " TL para hesabınıza yatmıştır.");
                                balance+=price;
                            }
                            break;
                        case 3:
                            System.out.print("Hesabınızdaki bakiye " + balance);
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Çıkış yaptınız.");
                            break;
                        default:
                            System.out.println("Tekrar görüşmek üzere");
                    }

                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;

            }
            else {
                rigth--;
                System.out.println("Sisteme giriş yapılamadı.");
                if(rigth==0)
                {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan Hakkınız " + rigth);
                }
            }
        }
    }
}
