package Sınıflar.Ornek1;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car(100,"Audi","red");
        audi.increaseSpeed(30);
        audi.decreaseSpeed(40);
        audi.printInfo();
       // audi.printSpeed();

        Car bmw = new Car(80, "BMW","black");
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(50);;
        bmw.increaseSpeed(10);
        bmw.printInfo();

        Car mercedes = new Car(10,"Mercedes", "white");
        mercedes.model = "Mercedes";
        mercedes.speed = 10;
        mercedes.printInfo();
    }
}
