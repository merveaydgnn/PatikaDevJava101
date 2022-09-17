package Sınıflar.Ornek1;

public class Car {

    //Nitelikler - Fields - Attribute
    int speed;
    String type;
    String model;
    String color;
    int speedLimit;


    //Bir nesne oluştururken constructor(kurucu/yapıcı) metot sayesinde nesnemize varsayılan değerleri atayabiliyoruz
    //Constructor

    public Car(int speed, String model, String color) {
        //this denildiğinde bu sınıfın içerisindeki niteliklere bakıyor
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit=100;
    }

    //Hız artırma. Gaza basıldığında bu metot çağırılcak.
    public void increaseSpeed(int increment){

        if((this.speed+increment) < speedLimit)
             this.speed+= increment;
    }

    public void decreaseSpeed(int decrease){

        if(this.speed >0)
        {
            this.speed-= decrease;
        }
    }

    public void printSpeed()
    {
        System.out.println(model + " modeli hızı : " + this.speed);
    }

    public void printInfo()
    {
        System.out.println("========================");
        System.out.println("Model \t: " + this.model);
        System.out.println("Rengi \t: " + this.color);
        System.out.println("Tipi  \t: " + this.type);
        System.out.println("Hızı  \t: " + this.speed);



    }
}
